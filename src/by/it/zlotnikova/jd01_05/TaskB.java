package by.it.zlotnikova.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        taskB1();
        taskB2();
    }

    private static void taskB1() {
        for (double a = 0; a <= 2; a += 0.2) {
            double y = 0;
            for (int x = 0; x <= 6; x++) {
                y = y + (pow(7, a) - cos(x));
            }
            System.out.printf("а = %-4.2g y =%-10.5g%n", a, y);
        }
    }

    private static void taskB2() {
        double a = 0;
        double b = 0;
        for (double x = -6; x < 2; x += 0.5) {
            if ((x / 2) == 0.2) {
                b = 1 / tan(pow(x, 2));
                a = log10(abs(b + 2.74));
                System.out.printf("При x/2 = %-4.2g a = %-12.8e%n", x / 2, a);
            } else if (-1 < x / 2 && x / 2 < 0.2) {
                b = cos(pow(x, 2));
                a = log10(abs(b + 2.74));
                System.out.printf("При x/2 = %-4.2g a = %-12.8e%n", x / 2, a);
            } else if (-2 < x / 2 && x / 2 <= -1) {
                b = sin(pow(x, 2));
                a = log10(abs(b + 2.74));
                System.out.printf("При x/2 = %-4.2g a = %-12.8e%n", x / 2, a);
            } else {
                System.out.printf("При х/2 = %-4.2g вычисления не определены%n", x / 2);
            }
        }
    }
}