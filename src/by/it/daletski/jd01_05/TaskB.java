package by.it.daletski.jd01_05;

import static java.lang.Math.*;

public class TaskB {

    public static void main(String[] args) {

        for (double a = 0; a < 2; a += 0.2) {
            double y = 0;
            for (int x = 1; x <= 6; x++) {
                y += pow (7, a) - cos (x);
            }
            System.out.printf ("%7s%.2f%7s%.10f\n","При a=",a, " Сумма =",y);

        }
    }


}

