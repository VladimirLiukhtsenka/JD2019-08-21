package by.it.agadzhanov.jd02_01;

public class Buyer extends Thread implements IBuyer,IUseBasket {

    private static Basket basket;

    Buyer(int buyerID) {
        this.setName("Покупатель №" + buyerID);
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println(">>> " + this + " вошел в магазин");
    }

    @Override
    public void takeBasket() {
        try {
            int pause = Rnd.fromTo(100 / Dispatcher.timeFactor, 200 / Dispatcher.timeFactor);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + ": ожидание завершено некорректно при вызове takeBasket()!");
        }
        basket = new Basket();
        System.out.println("\\_/ " + this + " взял корзину");
    }

    @Override
    public void chooseGoods() {
        try {
            int pause = Rnd.fromTo(500 / Dispatcher.timeFactor, 2000 / Dispatcher.timeFactor);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + ": ожидание завершено некорректно при вызове chooseGoods()!");
        }
        System.out.println("||| " + this + " выбрал товар");
    }

    @Override
    public void putGoodsToBasket() {
        try {
            int pause = Rnd.fromTo(100 / Dispatcher.timeFactor, 200 / Dispatcher.timeFactor);
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            System.out.println(this.getName() + ": ожидание завершено некорректно при вызове putGoodsToBasket()!");
        }
        basket.fillBasket();
        System.out.println("\\_/ " + this + " купил " + basket);
    }

    @Override
    public void goOut() {
        System.out.println("<<< " + this + " вышел из магазина");
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
