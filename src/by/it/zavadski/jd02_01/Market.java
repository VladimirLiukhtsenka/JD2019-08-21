package by.it.zavadski.jd02_01;

public class Market {
    public static void main(String[] args) {
        System.out.println("Market opened");
        for (int i = 0; i < 10; i++) {
            Buyer b = new Buyer(i);
            b.start();
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Market closed");
        }
    }
}
