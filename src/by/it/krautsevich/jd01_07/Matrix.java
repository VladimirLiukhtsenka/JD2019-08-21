package by.it.krautsevich.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {

    private double [][] value;

    public Matrix (double [][] values) {
        this.value = Arrays.copyOf(values, values.length) ;
    }

    public Matrix (Matrix otherMatrix) {
        this.value = otherMatrix.value ;
    }

    /* public  Vector (String stringVector) {
        String itWillBeVector = new String(stringVector.replace("{"," ")) ;
        String itWillBeVector2 = new String(itWillBeVector.replace("}","").trim()) ;
        String [] itWillBe = itWillBeVector2.split(",") ;
        double [] newVector = new double[itWillBe.length] ;
        for (int i = 0; i < itWillBe.length; i++) {
            newVector[i] = Double.parseDouble(itWillBe[i]) ;
        }
        this.value = newVector ;
    } */

    public Matrix (String stringMatrix) {
        String matrix1 = stringMatrix.replace("{{", "").replace("}}","").replace("{","").trim();
        String [] stringMat = matrix1.split("}," ) ;
        double[][] newMatrix = new double[stringMat.length][] ;
        for (int i = 0 ; i < stringMat.length ; i++) {
            String[] str = stringMat[i].split(",") ;
            newMatrix[i] =new double[str.length] ;
            for (int j = 0; j < str.length; j++) {
                newMatrix[i][j] = Double.parseDouble(str[j]);
            }
        }this.value = newMatrix;

     }
}
