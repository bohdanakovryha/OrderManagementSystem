package org.processing.orderthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderThreading {
    private ExecutorService executor = Executors.newFixedThreadPool(2);

    public void submitOrder(Runnable task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}
