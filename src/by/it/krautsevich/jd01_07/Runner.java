package by.it.krautsevich.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Scalar sc = new Scalar(3.1415) ;
        System.out.println(sc);

        Scalar sc2 = new Scalar(sc) ;
        System.out.println(sc2);

        Scalar sc3 = new Scalar("1234.567") ;
        System.out.println(sc3);

        double[] array = {1 , 2, 3, 4, 5} ;
        Vector v1 = new Vector(array) ;
        System.out.println(v1);
        Vector v2 = new Vector(v1) ;



    }
}
