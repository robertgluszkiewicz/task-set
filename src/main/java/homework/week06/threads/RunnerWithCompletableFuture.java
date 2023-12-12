package homework.week06.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnerWithCompletableFuture {
    private static final int POOL_SIZE = 7;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        BlockingQueue<DbConnection> pool = ConnectionPool.getConnectionPool();
        ProcessWithCompletableFuture[] processes = new ProcessWithCompletableFuture[POOL_SIZE];
        CompletableFuture<Void>[] futures = new CompletableFuture[POOL_SIZE];

        for (int i = 0; i < POOL_SIZE; i++) {
            processes[i] = new ProcessWithCompletableFuture(i + 1);
            futures[i] = processes[i].executeProcess(pool);
        }

        CompletableFuture<Void> allOfFutures = CompletableFuture.allOf(futures);

        try {
            allOfFutures.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
