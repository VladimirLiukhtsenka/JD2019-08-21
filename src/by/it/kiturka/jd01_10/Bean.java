package by.it.kiturka.jd01_10;

import java.lang.annotation.Target;

public class Bean {


    double sum(int a, int b) {
        double c = (a + b);
        return c;
    //   return (a+b);
    }

    @Param(a = 3, b = 4)
    static double max(int a, int b) {
        if (a > b) return a;
        else return b;

    }

    @Param(a = 3, b = 1)
    double min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    @Param(a = 3, b = 4)
    static double avg(int a, int b) {
         double average = (a + b) / 2.0;
        return average;

      //  return (a+b)/2.0;
    }
}
