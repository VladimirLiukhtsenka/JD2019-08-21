package by.it.liukhtenko.training.threads.atomictest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class WithAtomic {
    static class Counter {
        private AtomicInteger c = new AtomicInteger(0);

        public void increment() {
            c.incrementAndGet();
        }

        public int value() {
            return c.get();
        }
    }

    public static void main(final String[] arguments) throws InterruptedException {
        Counter counter = new Counter();
        int thCount = Thread.activeCount();
        for (int i = 0; i < 1000; i++) {
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.increment();
                }
            });
            th.start();
        }

        while (Thread.activeCount() > thCount) {
            Thread.sleep(100);
        }
        System.out.println("Final number (should be 1000): " + counter.value());
    }
}
