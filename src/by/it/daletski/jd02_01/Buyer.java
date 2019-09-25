package by.it.daletski.jd02_01;

public class Buyer extends Thread implements IBuyer,IUseBacket {


    Buyer(int number){

        super("Bayer № " + number);
    }

    @Override
    public void run() {

        enterToMarket ();
        chooseGoods ();
        goOut ();
        takeBacket();
        putGoodsToBacket();

        }

    @Override
    public void enterToMarket() {

        System.out.println (this+" enter to Market");


    }

    @Override
    public void chooseGoods() {

        System.out.println (this+" start choose goods");
        int timeout = Util.random(2000);
        Util.sleep (timeout);
        System.out.println (this+" end choose goods");

    }

    @Override
    public void goOut() {
        System.out.println (this+" leave to Market");
    }



    @Override
    public String toString() {
        return this.getName ();
    }


    @Override
    public void takeBacket() {
        System.out.println (this+" take backet");
        int timeout = Util.random(2000);
        Util.sleep (timeout);
    }

    @Override
    public void putGoodsToBacket() {
        System.out.println (this+" put goods to backet");
        int timeout = Util.random(2000);
        Util.sleep (timeout);
    }
}

