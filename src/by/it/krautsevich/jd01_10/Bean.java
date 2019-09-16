package by.it.krautsevich.jd01_10;

public class Bean {
    double sum (int a, int b) {
        return a+b ;
    }

    @Param(a=40 , b = 80)
    static double max (int a, int b) {
        double max1 ;
        if (a>b) { max1 =a ;}
        else max1 = b*1 ;
        return max1 ;
    }

    @Param(a=4 , b = 8)
    static double min (int a, int b) {
        double max1 = max(a, b);
        if ( max1== a) {return b ;}
        else return a ;

    }
    @Param(a=4 , b = 8)
    double avg (int a, int b) {
        return (a+b)/2.0 ;
    }
}
