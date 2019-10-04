package by.it.rojas.jd18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Runner {
    static HashMap<String,String> Good = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Good.put("milk "," 2 RUB");
        Good.put("banana "," 3 RUB");
        Good.put("chicken fillet "," 5 RUB");
        Good.put("juice "," 2.5 RUB");

        ArrayList<Thread> actorList = new ArrayList<>(200);
        System.out.println("The market is opened");


        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <=2 ; i++) {
            Cashier cashier = new Cashier(i);
            pool.execute(cashier);
        }

        while (!Dispatcher.planComplete()){
            Util.sleep(1000);
            int count = Rnd.fromTo(0,2);
            for (int i = 0; i <= count; i++) {
                if (!Dispatcher.planComplete())
                {
                    Buyer buyer = new Buyer();
                    actorList.add(buyer);
                }
            }
            Util.sleep(1000);
        }
        for (Thread actor : actorList) {
            actor.join();
        }
        pool.shutdown();
        while (! pool.isTerminated()){
            Thread.yield();
        }
        System.out.println("The market is closed");
    }
}
