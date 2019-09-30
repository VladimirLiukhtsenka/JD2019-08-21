package by.it.daletski.jd02_03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Market {

    public static void main(String[] args) throws InterruptedException {

        System.out.println ("Market opened");


        ExecutorService threadPool = Executors.newFixedThreadPool (5);


        for (int i = 0; i <=2 ; i++) {
            Cashier cashier = new Cashier (i);
            threadPool.execute (cashier);
        }


        List<Thread> actorList = new ArrayList<>(200);
        for (int i = 1; i <= 2; i++) {
            Cashier cashier = new Cashier (i);
            Thread thread = new Thread(cashier);
            actorList.add(thread);
            thread.start();
        }

        while (!Dispatcher.planComplete()) {
            int max = Util.random(2);
            for (int i = 0; i < max; i++)
                if (!Dispatcher.planComplete ()) {
                    Buyer buyer = new Buyer (1);
                    actorList.add (buyer);
                    buyer.start ();
                }
            Util.sleep(1000);
        }
        for (Thread actor : actorList) {
            actor.join();
        }
        threadPool.shutdown ();
        while (!threadPool.isTerminated ()){
            Util.sleep (1);
        }
        System.out.println("Market closed");
    }

}
