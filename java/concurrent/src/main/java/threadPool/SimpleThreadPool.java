package threadPool;

import java.util.concurrent.*;

/**
 * Created by zsh on 2016/9/20.
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10));
        for (int i = 0; i < 10; i++) {
            executor.execute(new WorkerThread("" + i));
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
