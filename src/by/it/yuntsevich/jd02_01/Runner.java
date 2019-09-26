package by.it.yuntsevich.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Магазин открыт");
        int numberBuyers = 0;
        List<Buyer> buyerList = new ArrayList<>(200);
        for (int time = 0; time < 120; time++) {
            int countBuyers = Util.random(2);
            for (int i = 0; i < countBuyers; i++) {
                Buyer buyer = new Buyer(++numberBuyers);
                buyerList.add(buyer);
                buyer.start();
            }
            Util.sleep(1000);
        }
        for (Buyer b: buyerList)
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Магазин закрыт");
    }
}
