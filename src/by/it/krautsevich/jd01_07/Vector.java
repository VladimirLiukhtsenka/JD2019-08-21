package by.it.krautsevich.jd01_07;

import java.util.Arrays;

public class Vector extends Var {

    private double [] value;

    public Vector (double [] values) {
        this.value = Arrays.copyOf(values, values.length) ;
    }

    public Vector (Vector otherVector) {
        this.value = otherVector.value ;
    }

    public  Vector (String stringVector) {
        String itWillBeVector = new String(stringVector.replace("{"," ")) ;
        String itWillBeVector2 = new String(itWillBeVector.replace("}","").trim()) ;
        String [] itWillBe = itWillBeVector2.split(",") ;
        double [] newVector = new double[itWillBe.length] ;
        for (int i = 0; i < itWillBe.length; i++) {
            newVector[i] = Double.parseDouble(itWillBe[i]) ;
        }
        this.value = newVector ;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("{");
        String delimeter = "" ;
        for (double v : value) {sb.append(delimeter).append(v);
        delimeter = ", " ;}
        sb.append('}') ;
        return sb.toString() ;
    }
}
