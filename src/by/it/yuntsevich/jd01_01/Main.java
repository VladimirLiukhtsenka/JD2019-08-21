package by.it.yuntsevich.jd01_01;

public class Main {

    public static void main(String[] args) {

        Slogan slogan = new Slogan();

        slogan.printSlogan();
        slogan.setSlogan("Привет, мир!");
        slogan.printSlogan();

        Args argObject = new Args(args);
        argObject.printArgs();
    }
}
