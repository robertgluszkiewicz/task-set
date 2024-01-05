package homework.week06.threads;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Process implements Runnable{
    private int id;

    public Process(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        try {
            BlockingQueue<DbConnection> connectionPool = ConnectionPool.getConnectionPool();
            DbConnection dbConnection = connectionPool.take();
            Random random = new Random();
            int time = random.nextInt(100, 5_001);
            System.out.println("Process[" + getId() + "] takes Connection[" + dbConnection.getId() + "] for " + time + "ms");
            Thread.sleep(time);

            System.out.println("Process[" + getId() + "] released Connection[" + dbConnection.getId() +"]");
            connectionPool.put(dbConnection);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
