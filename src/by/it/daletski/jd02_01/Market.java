package by.it.daletski.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Market {

    public static void main(String[] args) {
        int numberBuyer = 0;
        System.out.println ("Market opened");
        List<Buyer> buyerList = new ArrayList<> (200);
        for (int time = 0; time <= 120; time++) {
            int max = Util.random (2);
            for (int i = 0; i < max; i++) {
                Buyer b = new Buyer (++numberBuyer);
                buyerList.add(b);
                b.start ();
            }
            Util.sleep (1000);
        }
        for (Buyer b : buyerList){
            try {
                b.join ();
            } catch (InterruptedException e){
                e.printStackTrace ();
            }
        }

        System.out.println ("Market closed");
    }

}
