package by.it.agadzhanov.jd02_03;

public class Buyer extends Thread implements IBuyer, IUseBasket {

    private Basket basket;
    private boolean pensioner;
    private boolean waiting = false;

    void resetWaiting() {
        waiting = false;
    }

    Basket getBasket() {
        return basket;
    }

    Buyer() {
        int randomNumber = Util.randomFromTo(1, 4);
        pensioner = randomNumber == 1;
        if (pensioner) {
            this.setName("Покупатель(пенсионер) №" + Dispatcher.buyerEnter());
        } else {
            this.setName("Покупатель №" + Dispatcher.buyerEnter());
        }
        basket = new Basket();
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goToQueue();
        goOut();
    }

    @Override
    public void enterToMarket() {

        System.out.println(">>> " + this + " вошел в магазин");
    }

    @Override
    public void takeBasket() {
        int pause = Util.randomFromTo(100, 200);
        if (pensioner) {
            Util.sleepPensioner(pause);
        } else {
            Util.sleepAccelerated(pause);
        }
        System.out.println("\\_/ " + this + " взял корзину");
    }

    @Override
    public void chooseGoods() {
        int pause = Util.randomFromTo(500, 2000);
        if (pensioner) {
            Util.sleepPensioner(pause);
        } else {
            Util.sleepAccelerated(pause);
        }
        System.out.println("||| " + this + " выбрал товар");
    }

    @Override
    public void putGoodsToBasket() {
        int pause = Util.randomFromTo(100, 200);
        if (pensioner) {
            Util.sleepPensioner(pause);
        } else {
            Util.sleepAccelerated(pause);
        }
    }

    @Override
    public void goToQueue() {
        BuyersQueue.put(this);
        waiting = true;
        System.out.println("... " + this + " встал в очередь");
        synchronized (this) {
            while (waiting) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    System.out.println("Ошибка во время ожидания покупателя " + this);
                }
            }
        }
        System.out.println("!!! " + this + " покинул очередь");
    }

    @Override
    public void goOut() {
        Dispatcher.buyerExit();
        System.out.println("<<< " + this + " вышел из магазина");
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
