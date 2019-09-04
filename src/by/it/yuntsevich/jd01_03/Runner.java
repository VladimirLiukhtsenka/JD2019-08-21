package by.it.yuntsevich.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] array = InOut.getArray(sc.nextLine());

        InOut.printArray(array);
        InOut.printArray(array, "A", 4);

        double a = Helper.findMin(array);
        System.out.println(a);
        double b = Helper.findMax(array);
        System.out.println(b);
        Helper.sort(array);


        double matrix[][] = new double[5][3];
        double vector[] = new double[3];

        Helper.mul(matrix, vector);

        double matrixLeft[][] = new double[3][3];
        double matrixRight[][] = new double[3][3];

        Helper.mul(matrixLeft, matrixRight);

    }
}
