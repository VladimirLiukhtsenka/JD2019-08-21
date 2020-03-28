package by.it.liukhtenko.training.threads.blockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingQueueMain {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(5);
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    boolean flag = queue.offer("java" + i); //put, add
                    System.out.println("Element index " + i + " added "+flag);
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Element " + queue.poll() + " took"); //take, remove
                    TimeUnit.MILLISECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        try {
            TimeUnit.SECONDS.timedJoin(Thread.currentThread(), 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue);
    }
}
