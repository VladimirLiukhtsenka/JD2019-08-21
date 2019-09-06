package by.it.zavadski.jd01_08;



public class Runner {
    private static void print(Var var) { System.out.println(var);}
    public static void main(String[] args) {
        Var s=new Scalar(3.0);
        Var v=new Vector(new double[]{1,2,3});
       // Var m=new Matrix("{{1,2,3},{4,5,6},{7,8,9}}");

        print(s.add(s)); //выведет в консоль 6.0
        print(s.sub(s)); //выведет в консоль 0.0
        print(s.mul(s)); //выведет в консоль 9.0
        print(s.div(s));
    }
}
