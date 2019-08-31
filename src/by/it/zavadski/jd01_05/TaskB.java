package by.it.zavadski.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step4();
        step5();
    }

    private static void step4() {
double y=0;

        for (double a = 0; a <=2 ; a+=0.2) {
            for (double x = 1; x <6 ; x++) {
                y=y+(pow(7,a))-cos(x);

            }

            System.out.printf("For a=%.2f Sum=%f\n",a,y);
        }
    }

    private static void step5() {
    }
}
