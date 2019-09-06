package by.it.krautsevich.jd01_07;

import java.util.Arrays;

public class Vector extends Var {

    private double [] values;

    public Vector (double [] values) {
        this.values = Arrays.copyOf(values, values.length) ;
    }

    public Vector (Vector otherVector) {
        this.values = otherVector.values ;
    }

    public  Vector (String stringVector) {
        String itWillBeVector = new String(stringVector.replace("{"," ")) ;
        String itWillBeVector2 = new String(itWillBeVector.replace("}","").trim()) ;
        String [] itWillBe = itWillBeVector2.split(",") ;
        double [] newVector = new double[itWillBe.length] ;
        for (int i = 0; i < itWillBe.length; i++) {
            newVector[i] = Double.parseDouble(itWillBe[i]) ;
        }
        this.values = newVector ;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("{");
        String delimeter = "" ;
        for (double v : values) {sb.append(delimeter).append(v);
        delimeter = ", " ;}
        sb.append('}') ;
        return sb.toString() ;
    }
}
