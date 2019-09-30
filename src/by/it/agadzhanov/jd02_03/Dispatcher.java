package by.it.agadzhanov.jd02_03;

import java.util.concurrent.atomic.AtomicInteger;

class Dispatcher {

    static final int timeFactor = 1000;              //не менять, чтобы не было ошибки привеления к int в методах sleep
    static final double pensionerFactor = 1.5;       //поле, замедляющее все действия пенсионеров

    //Параметры покупателя
    private static final int MAX_BUYERS = 100;
    private static final AtomicInteger buyerCount = new AtomicInteger(0);
    private static final AtomicInteger buyersInMarket = new AtomicInteger(0);

    //Параметры кассира
    static final int MAX_CASHIERS = 2;
    static final AtomicInteger cashierCount = new AtomicInteger(0);

    static boolean marketIsOpen() {
        return !planComplete() || buyersInMarket.get() > 0;
    }

    static boolean planComplete() {
        return buyerCount.get() == MAX_BUYERS;
    }

    static int buyerEnter() {
        buyerCount.getAndIncrement();
        buyersInMarket.getAndIncrement();
        return buyerCount.get();
    }

    static void buyerExit() {
        buyersInMarket.getAndDecrement();
    }

    static void resetBuyerCount() {
        buyerCount.set(0);
    }

    static void resetCashierCount() {
        cashierCount.set(0);
    }
}
