package by.it.yuntsevich.jd01_10;

class Bean {
    static double sum(int a, int b){
        return a+b;
    }
    @Param(a=10, b=12)
    double max(int a, int b){
        return a>b?a:b;
    }
    @Param(a=-10,b=100)
    double min(int a, int b){
        return a<b?a:b;
    }
    @Param(a=20, b=25)
    static double avg(int a, int b){
        return (a+b)/2.0;
    }
}
