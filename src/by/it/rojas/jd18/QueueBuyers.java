package by.it.rojas.jd18;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

class QueueBuyers {

    private static BlockingDeque<Buyer> deque = new LinkedBlockingDeque<>(20);

    static void add(Buyer buyer) {
        try {
            deque.putLast(buyer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Buyer extract() {
        return deque.pollFirst() ;
    }
}
