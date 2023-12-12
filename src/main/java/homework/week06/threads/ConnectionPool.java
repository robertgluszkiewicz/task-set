package homework.week06.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
    private static final int POOL_SIZE = 5;
    private static BlockingQueue<DbConnection> connectionPool;

    private ConnectionPool() {
    }

    public static synchronized BlockingQueue<DbConnection> getConnectionPool() {
        if (connectionPool == null) {
            connectionPool = new ArrayBlockingQueue<>(POOL_SIZE);
            for (int i = 0; i < POOL_SIZE; i++) {
                connectionPool.add(new DbConnection(i + 1));
            }
        }
        return connectionPool;
    }
}
