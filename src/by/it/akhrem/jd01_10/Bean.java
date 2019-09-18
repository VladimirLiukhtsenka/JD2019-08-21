package by.it.akhrem.jd01_10;

class Bean {

    double sum(int a, int b) {
        return a+b;
    }
    @Param(a=10, b=12)
    static double max(int a, int b) {
        return a>b?a:b;
    }
    @Param(a=-10, b=100)
    static double min(int a, int b) {
        return a<b?a: b;
    }
    @Param(a=20, b=25)
    double avg(int a, int b) {
        return (a+b)/2.0;
    }

}
