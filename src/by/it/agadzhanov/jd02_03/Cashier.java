package by.it.agadzhanov.jd02_03;

public class Cashier implements Runnable {

    private String name;

    Cashier() {
        name = "Кассир №" + Dispatcher.cashierCount.incrementAndGet();
    }

    @SuppressWarnings("SynchronizationOnLocalVariableOrMethodParameter")
    @Override
    public void run() {
        System.out.println(this + " начал работу");

        while (Dispatcher.marketIsOpen()) {
            Buyer buyer = BuyersQueue.callFromQueue();
            if (buyer != null) {
                System.out.println(this + " начал обслуживать " + buyer);
                int serviceTime = Util.randomFromTo(2000, 5000);
                Util.sleepAccelerated(serviceTime);
                //System.out.println("$$$ " + buyer + " купил " + buyer.getBasket());
                System.out.println(this + " закончил обслуживать " + buyer);
                synchronized (buyer) {
                    buyer.resetWaiting();
                    buyer.notifyAll();     //Почему нужен именно notifyAll() ?
                }
            } else {
                Util.sleepAccelerated(1000);
            }
        }

        System.out.println(this + " закончил работу");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
