package homework.week06.threads;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;

public class ProcessWithCompletableFuture {
    private int id;

    public ProcessWithCompletableFuture(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public CompletableFuture<Void> executeProcess(BlockingQueue<DbConnection> connectionPool) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                DbConnection dbConnection = connectionPool.take();
                Random random = new Random();
                int time = random.nextInt(100, 5_001);
                System.out.println("Process[" + getId() + "] takes Connection[" + dbConnection.getId() + "] for " + time + "ms");
                Thread.sleep(time);
                System.out.println("Process[" + getId() + "] released Connection[" + dbConnection.getId() + "]");
                connectionPool.put(dbConnection);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        });
        return future;
    }
}