package by.it.liukhtenko.training.threads.atomictest;

import java.util.concurrent.TimeUnit;

public class WithoutAtomic {
    static class Counter {
        private Integer c = 0;

        public void increment() {
            c++;
        }

        public int value() {
            return c;
        }
    }

    public static void main(final String[] arguments) throws InterruptedException {
        final Counter counter = new Counter();
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
