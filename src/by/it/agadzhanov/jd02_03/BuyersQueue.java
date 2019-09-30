package by.it.agadzhanov.jd02_03;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

class BuyersQueue {

    private static BlockingDeque<Buyer> buyersQueue = new LinkedBlockingDeque<>(30);

    static void put(Buyer buyer) {
        try {
            buyersQueue.putLast(buyer);
        } catch (InterruptedException e) {
            System.out.println("Помещение элемента в очередь было прервано!");
        }
    }

    static Buyer callFromQueue() {
        return buyersQueue.pollFirst();
    }
}
