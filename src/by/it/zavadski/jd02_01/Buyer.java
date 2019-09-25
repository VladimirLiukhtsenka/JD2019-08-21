package by.it.zavadski.jd02_01;

public class Buyer extends Thread implements IBuyer{
    public Buyer (int number){
        super("Buyer#"+number);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Enter into market");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Start select goods");
        System.out.println("End selecting goods");
    }

    @Override
    public void goOut() {

    }
}
