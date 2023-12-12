package homework.week06.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    private static final int POOL_SIZE = 7;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            executor.execute(new Process(i + 1));
        }
        executor.shutdown();
    }
}
