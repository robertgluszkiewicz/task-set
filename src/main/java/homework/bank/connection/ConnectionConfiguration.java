package homework.bank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionConfiguration implements ConnectionPool{
    private String url;
    private String user;
    private String password;
    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private static int MIN_POOL_SIZE = 5;
    private static int MAX_POOL_SIZE = 15;

    public ConnectionConfiguration(String url, String user, String password, List<Connection> connectionPool) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.connectionPool = connectionPool;
    }

    @Override
    public String getDbUrl() {
        return url;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public static  ConnectionConfiguration create(String url, String user, String password) throws SQLException {
        List<Connection> pool = new ArrayList<>(MIN_POOL_SIZE);
        for (int i = 0; i < MIN_POOL_SIZE; i++) {
            pool.add(createConnection(url, user, password));
        }
        return new ConnectionConfiguration(url, user, password, pool);
    }

    @Override
    public Connection getConnection() throws SQLException {
        if (connectionPool.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                connectionPool.add(createConnection(url, user, password));
            } else throw new RuntimeException("Maximum connection pool size was reached");
        }
        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }

    private static Connection createConnection(String url, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        if (connection != null) {
            System.out.println("Connection created");
        } else {
            throw new SQLException("Connection failed");
        }
        return connection;
    }
}
