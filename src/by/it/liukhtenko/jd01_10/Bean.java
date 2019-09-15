package by.it.liukhtenko.jd01_10;

public class Bean {
    public Bean (){}
    @Param(a=3,b=4)
   static double sum (int a,int b){
        return  (a+b);
    }
    @Param(a=5,b=6)
    static double max (int a,int b){
       return a>b?a:b;
    }
    @Param(a=7,b=8)
     double min (int a,int b){
        return  a>b?b:a;
    }
     double avg (int a,int b){
        return  (a+b)/2.0;
    }
}
