package by.it.zavadski.jd01_01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Slogan slogan=new Slogan();
        slogan.printSlogan();
        slogan.setSlogan("Privet");
        slogan.printSlogan();

        Args argsObject=new Args(args);
        argsObject.printArgs();
    }
}
