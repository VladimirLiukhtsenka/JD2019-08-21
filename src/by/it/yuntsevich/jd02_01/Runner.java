package by.it.yuntsevich.jd02_01;

import java.util.*;

public class Runner {


    static Map<String, Double> goods = new HashMap<>(20);

    static Map.Entry<String, Double> takeGoods() {
        goods.put("Гречка", 1.0);
        goods.put("Сахар", 0.99);
        goods.put("Хлеб", 0.8);
        goods.put("Огурец", 3.6);
        goods.put("Молоко", 2.0);
        goods.put("Курица", 8.6);
        goods.put("Капуста", 0.68);
        goods.put("Макароны", 2.9);
        goods.put("Картофель", 0.86);
        goods.put("Мука", 1.57);
        Set<Map.Entry<String, Double>> entries = goods.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();
        int number = Util.random(1, goods.size());
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            if (i == number)
                return iterator.next();
            else iterator.next();
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println("Магазин открыт");
        int numberBuyers = 0;
        List<Buyer> buyerList = new ArrayList<>(200);
        numberBuyers = generateBuyers(numberBuyers, buyerList, 0);
        generateBuyers(numberBuyers, buyerList, 60);
        for (Buyer b : buyerList)
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Магазин закрыт");
    }

    private static int generateBuyers(int numberBuyers, List<Buyer> buyerList, int startTime) {
        for (int time = startTime; time < startTime + 30; time++) {
            int countBuyers = Util.random(2);
            for (int i = 0; i < countBuyers; i++) {
                Buyer buyer = new Buyer(++numberBuyers);
                if (numberBuyers % 4 == 0) {
                    buyer.setPensioneer(true);
                }
                buyerList.add(buyer);
                buyer.start();
            }
            Util.sleep(1000);
        }
        for (int time = startTime + 30; time < startTime + 60; time++) {
            if (buyerList.size() <= 40 + (30 - time)) {
                int countBuyers = Util.random(2);
                for (int i = 0; i < countBuyers; i++) {
                    Buyer buyer = new Buyer(++numberBuyers);
                    if (numberBuyers % 4 == 0) {
                        buyer.setPensioneer(true);
                    }
                    buyerList.add(buyer);
                    buyer.start();
                }
                Util.sleep(1000);
            }
        }
        return numberBuyers;
    }
}
