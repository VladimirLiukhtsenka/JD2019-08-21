package by.it.akhrem.jd02_02;

public class Cashier implements Runnable {
    private String name;

    public  Cashier(int number) {
        name = "Cashier " + number;
    }
    @Override
    public void run() {
        while(Dispathcher.marketIsOpened()) {
            Buyer buyer = QueueBuyers.extract();
            if (buyer != null) {
                System.out.println(this + " start service " + buyer);
                int timeout = Util.random(2000, 5000);
                Util.sleep(timeout);
                System.out.println(this + " stop service " + buyer);
                synchronized (buyer) {
                    buyer.notify();
                }
            } else { Util.sleep(1);//bad solution

        }
    }

    //to string
    //return name;
}

