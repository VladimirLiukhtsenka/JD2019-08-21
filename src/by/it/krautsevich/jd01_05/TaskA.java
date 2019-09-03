package by.it.krautsevich.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {

        TaskA1();
        TaskA2();
        TaskA3();


}

    private static void TaskA3() {

        double x = 12.1;
        double a;
        double f;

        for (a = -5; a <=12 ; a+=3.75) {

            f = pow(E, a*x) - 3.45*a ;
            System.out.printf("%-6s %-6.2f %-4s %-15.4f", "При а=", a, "f=", f);
            System.out.println();
        }


    }


    private static void TaskA1() {
        double x = 0.3;
        double a = 756.13;

        double z = cos(pow((x*x +PI/6),5)) - pow((x*pow(a,3)),0.5) - log(abs((a - 1.12*x)/4));

        System.out.println(z);

        double var1= cos(pow((x*x +PI/6),5)) ;
        double var2 =  pow((x*pow(a,3)),0.5) ;
        double var3 =  log(abs((a - 1.12*x)/4)) ;
        z = var1 - var2 - var3 ;

        System.out.println(z);
    }

    private static void TaskA2() {
        double a = 1.21 ;
        double b = 0.371 ;

        double y = tan (pow ((a + b),2)) - pow(a + 1.5, 1/3.0) + a* pow(b,5) - b /(log(a*a)) ;
        System.out.println(y);
    }
}
