package by.it.agadzhanov.jd01_10;

public class Bean {
    @Param(a = 5, b = 7)
    public static double sum(int a, int b) {
        return a + b;
    }

    public double max(int a, int b) {
        return a > b ? a : b;
    }

    @Param(a = -10, b = -2)
    public double min(int a, int b) {
        return a < b ? a : b;
    }

    @Param(a = 3, b = 4)
    public static double avg(int a, int b) {
        return (a + b) / 2.0;
    }
}
