package by.it.krautsevich.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);


        double [][] matrix = new double [array.length][array.length];
        double [] vector  = new double [array.length];

        double res[] = Helper.mul(matrix, vector);

        double [][] matrixLeft = new double [array.length][array.length];
        double [][] matrixRight = new double [array.length][array.length];

        double result0 [][] = Helper.mul(matrixLeft, matrixRight);

    }
}























