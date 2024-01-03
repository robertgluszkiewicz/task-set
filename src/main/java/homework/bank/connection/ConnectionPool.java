package homework.bank.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionPool {
    Connection getConnection() throws SQLException;
    boolean releaseConnection(Connection connection);

    String getDbUrl();
    String getUser();
    String getPassword();
}
