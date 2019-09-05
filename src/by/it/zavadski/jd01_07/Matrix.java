package by.it.zavadski.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {
    private double[] value;


    public Matrix (double[][] value){



    }

    public Matrix(Matrix matrix){
        this.value=matrix.value;
    }
}
