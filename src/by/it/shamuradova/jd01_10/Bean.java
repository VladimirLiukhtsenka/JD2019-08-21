package by.it.shamuradova.jd01_10;

public class Bean {

    @Param(a=5, b=8)
    static double sum(int a, int b) {
        double sum = a + b;
        return sum;
    }
    @Param(a=15, b=23)
    static double max(int a, int b) {             //return a>b?a:b;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    @Param(a=10, b=8)
    double min (int a, int b){    ////return a<b?b:a;
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    double avg (int a, int b) {
        return (a+b)/2.0; //чтобы сделать число дробным, нужно чтобы один из операнд был дробным
    }
}
