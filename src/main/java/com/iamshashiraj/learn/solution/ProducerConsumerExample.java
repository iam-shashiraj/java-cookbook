package com.iamshashiraj.learn.solution;

import java.util.HashMap;
import java.util.concurrent.*;

public class ProducerConsumerExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); // handles concurrent thread access
        ExecutorService service = Executors.newFixedThreadPool(5);

        System.out.println(Runtime.getRuntime().availableProcessors());
        /*ExecutorService services = Executors.newSingleThreadExecutor();
        Future<?> future = services.submit(new Task());
        System.out.println("In Future Object" + future.get());

        Thread ProducerThread = new Thread(() -> {
            public void run() {
                if (queue.size() == 4) {
                    wait();
                } else {
                    queue.add((int) Math.random());
                    notify();
                }

            }
        });

        Thread ConsumerThread = new Thread(() -> {
            public void run() {
                if (queue.isEmpty()) {
                    wait();
                } else {
                    queue.peek();
                    notify();
                }
            }
        });*/
    }


}

class Task implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("In call");
        String name = "test";
        return name;
    }
}
