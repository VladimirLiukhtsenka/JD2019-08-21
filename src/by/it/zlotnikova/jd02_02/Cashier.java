package by.it.zlotnikova.jd02_02;

public class Cashier implements Runnable {

    private String name;

    public Cashier(int number) {
        name = "Cashier " + number;
    }

    @Override
    public void run() {
        while (Dispatcher.marketIsOpen) {

        }
    }

    @Override
    public String toString() {
        return name;
    }
}
