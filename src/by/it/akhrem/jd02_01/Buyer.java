package by.it.akhrem.jd02_01;

import com.sun.xml.internal.ws.resources.UtilMessages;

public class Buyer extends Thread implements IBuyer {

    public Buyer(int number) {
        super("Buyer "+ number);
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Enter to market");
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void chooseGoods() {
        System.out.println("started to choose goods");
        int timeout = Util.random(2000);
        Util.sleep(timeout);
        System.out.println("end to choose goods");
    }

    @Override
    public void goOut() {
        System.out.println("leave the market");
    }
}
