package by.it.daletski.jd02_03;

import java.util.concurrent.atomic.AtomicInteger;

public class Dispatcher {

    static int kSpeed = 1000;

    private static final int MAX_BUYERS = 100;
    private static final AtomicInteger buyerCounter = new AtomicInteger (0);
    private static final AtomicInteger buyerInMarket = new AtomicInteger (0);
    private static final Object monitor = new Object ();

    static boolean marketIsOpened() {
        synchronized (monitor) {
            return !planComplete () || buyerInMarket.get () > 0;
        }
    }

    static boolean planComplete() {
        synchronized (monitor) {
            return buyerCounter.get () == MAX_BUYERS;
        }
    }

    static int buyerInMarket() {
        synchronized (monitor) {
            buyerCounter.getAndIncrement ();
            buyerInMarket.getAndIncrement ();
            return buyerCounter.get ();
        }
    }

    static void buyerLeaveMarket() {
        synchronized (monitor) {
            buyerInMarket.getAndDecrement ();
        }
    }


}
