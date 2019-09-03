package by.it.akhmelev.jd01_01;

public class Main {

    public static void main(String[] args) {
        Slogan sl=new Slogan();
        System.out.println(sl.getSlogan());

        sl.setSlogan("Привет!!");
        System.out.println(sl.getSlogan());

        Printer.print(args);
    }

}
