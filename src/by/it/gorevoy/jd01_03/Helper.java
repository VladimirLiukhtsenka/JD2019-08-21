package by.it.gorevoy.jd01_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Helper {

    static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];

        }
        return min;
    }
    static double findMax(double[ ] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];

        }return max;
    }
    static void sort(double[ ] arr){
        Arrays.sort(arr);
    }

    static double[ ] mul(double[ ][ ] matrix, double[ ] vector){
        double[] a = new double[matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <vector.length ; j++) {
                a[i] = a[i]+matrix[i][j]*vector[j];

            }

        }return a;
    }
    static double[ ][ ] mul (double[ ][ ] matrixLeft, double[ ][ ] matrixRight) {
        double[][] b = new double[matrixLeft.length][matrixRight.length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight.length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    b[i][j] = b[i][j] + matrixLeft[i][k] * matrixLeft[k][j];

                }
            }
        }return b;
    }
}

