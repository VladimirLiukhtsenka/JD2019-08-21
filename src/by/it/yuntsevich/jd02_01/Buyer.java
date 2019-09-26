package by.it.yuntsevich.jd02_01;

public class Buyer extends Thread implements IBuyer {

    public Buyer(int num){
    super("Покупатель № " + num + " ");
    }

@Override
public void run(){
        enterToMarket();
        chooseGoods();
        goOut();
}

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void enterToMarket() {
        System.out.println(this + "вошел в магазин");
    }

    @Override
    public void chooseGoods() {
        System.out.println(this + " начал выбирать товары");

        int timeout = Util.random(2000);
        Util.sleep(timeout);
        System.out.println(this + "выбрал товары");

}



    @Override
    public void goOut() {
        System.out.println(this + "вышел из магазина");
    }
}
