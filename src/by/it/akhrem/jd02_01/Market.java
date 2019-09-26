package by.it.akhrem.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public static void main(String[] args) {
        System.out.println("Market opened");
        int numberBuyer = 0;
        List<Buyer> buyerList = new ArrayList<>(200);
        for (int time = 0; time < 120; time++) {
            int countBuer = Util.random(2);
            for (int i=0; i < countBuer; i++) {
                Buyer b = new Buyer(++numberBuyer);
                buyerList.add(b);
                b.start();
            }
            Util.sleep(1000);
        }
        for (Buyer b: buyerList)
            try {
              b.join();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
        System.out.println("Market closed");
    }
}
