package by.it.krautsevich.jd01_05;
import static java.lang.Math.*;
public class TaskB {
    public static void main(String[] args) {

        TaskB1();

        System.out.println();

        TaskB2();

        double q= log(abs(cos(0) + 2.74));
        System.out.printf("%-15.10e", q);
    }

    private static void TaskB2() {

        for (double x = -6 +0.5; x < 2 ; x+= 0.5) {
            if ((-2 < (x / 2)) && ((x / 2) <= -1)) {
                double y = log10 (abs(sin(x*x) + 2.74));
                System.out.printf("%-6s %-3.2f %-5s %-4.2f %-9s %-8s %-2.8e", "При x=", x, "x/2=", x/2, "beta = sin(x*x)", "a=", y);
                System.out.println();}

            else if ((x/2 > -1) && (x/2 < 0.2)) {
                double y = log10 (abs(2.74 +cos(x*x)));
                System.out.printf("%-6s %-3.2f %-5s %-4.2f %-9s %-8s %-2.8e", "При x=", x, "x/2=", x/2, "beta = cos(x*x)", "a=", y);
                System.out.println();
            }

            else if (x/2 == 0.2) {

                double y = log10 (abs(2.74 +pow(tan(x*x), -1)));
                System.out.printf("%-6s %-3.2f %-5s %-4.2f %-9s %-8s %-2.8e", "При x=", x, "x/2=", x/2, "beta = ctg(x*x)", "a=", y);
                System.out.println();

            }

            else {
                System.out.printf("%-6s %-3.2f %-5s %-4.2f %-9s", "При x=", x, "x/2=", x/2, "вычисления не определены");
                System.out.println();
            }


        }



    }

    private static void TaskB1() {
        for (double a = 0; a <= 2 ; a+= 0.2) {

            double y =0;

            for (int i = 1; i <= 6 ; i++) {

                y= y+ (pow(7,a) - cos(i)) ;}

            System.out.printf("%-6s %-6.2f %-4s %-15.4f", "При a=", a, "y=", y);
            System.out.println();}
    }

}
