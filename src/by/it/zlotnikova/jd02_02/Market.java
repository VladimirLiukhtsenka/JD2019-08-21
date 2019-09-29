package by.it.zlotnikova.jd02_02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Market {

    static Map<String, Double> goods;

    public static void main(String[] args) {

        goods = createGoodsList();

//        int time = 120; //seconds; a period of time when the market is open
        int buyerNumber = 1;
        int entersMarket = 0;
        int leavesMarket = 0;
        List<Buyer> buyerList = new LinkedList<>();

        System.out.println("xxx The market opens xxx");

        while (buyerNumber <= 100) {
            int counter = Utils.random(2);
            for (int j = 0; j <= counter; j++) {
                Buyer buyer = new Buyer("Buyer " + buyerNumber);
                buyerNumber++;
                buyerList.add(buyer);
                buyer.start();
                entersMarket++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // check number of buyers in the market
//        int countBuyers = 0;
//        Iterator<Buyer> it = buyerList.iterator();
//        while (it.hasNext()) {
//            if (it.next().isAlive()) {
//                countBuyers++;
//            }
//        }
//        System.out.println("\tBuyers in the market: " + countBuyers);

        buyerList.forEach(buyer -> {
            try {
                buyer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("xxx The market closes xxx");
    }

    private static Map<String, Double> createGoodsList() {
        Map<String, Double> goods = new HashMap<>();
        goods.put("bread", 2.0);
        goods.put("butter", 6.0);
        goods.put("milk", 3.0);
        goods.put("sugar", 4.0);
        goods.put("meat", 8.0);
        goods.put("fish", 7.0);
        goods.put("potatoes", 1.0);
        goods.put("cookies", 5.0);
        return goods;
    }
}