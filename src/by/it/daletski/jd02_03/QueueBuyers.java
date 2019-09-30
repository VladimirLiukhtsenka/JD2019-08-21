package by.it.daletski.jd02_03;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

class QueueBuyers {


    private static BlockingDeque<Buyer> deque=new LinkedBlockingDeque<> (30);
    //sync QueueBuyers.class

    static void add(Buyer buyer){

        deque.addLast (buyer);
    }

   static Buyer extract(){


        return deque.pollFirst ();
    }


}
