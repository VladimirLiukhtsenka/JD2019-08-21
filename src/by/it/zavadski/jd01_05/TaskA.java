package by.it.zavadski.jd01_05;

import static java.lang.Math.exp;

public class TaskA{
    public static void main(String[] args) {
        step3();
    }
    public static void void step3()
    {
        double x=12.1;
        for (double a = -5; a <=12 ; a+=3.75) {
            double f=exp(a+x) - 3.45*a;
            System.out.println("For a=%12g f=%12g",a,f);
        }
    }



}