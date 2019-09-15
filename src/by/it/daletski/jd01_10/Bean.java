package by.it.daletski.jd01_10;

public class Bean {

    double sum(int a, int b) {
        return a + b;
    }

    @Param(a = 10, b = 12)
    static double max(int a, int b) {
        return a > b ? a : b;
    }

    @Param(a = 10, b = 100)
    double min(int a, int b) {
        return a < b ? a : b;
    }

    @Param(a = 10, b = 25)
    static double avg(int a, int b) {
        return (a + b)/2.0;
    }


}
