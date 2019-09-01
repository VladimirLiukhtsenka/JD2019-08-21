package by.it.krautsevich.jd01_03;

public class Helper {
    static double findMin(double[] array) {
        Double Min = array[0];
        for (double element : array) {
            if (Min > element) Min = element;
        }
        System.out.println(Min);
        return Min;
    }

    static double findMax(double[] array) {
        Double Max = array[0];
        for (double element : array) {
            if (Max < element) Max = element;}
        System.out.println(Max);
        return Max;
    }

    static void sort(double[] array) {
        double forSort = array[0];
        for (int numberOfSort = 0; numberOfSort < array.length - 1; numberOfSort++)
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    forSort = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = forSort;
                }
            }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d] = %-10.4f", "Sorted", i, array[i]);
            if ((i + 1) % 5 == 0 || i + 1 == array.length) {
                System.out.println();
            }

        }
    }

    static double[] mul(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for (int i =0; i< matrix.length; i++ ) {
            result [i] =0;
            for (int k = 0; k < matrix[0].length; k++ )
            {result [i] = result [i] + vector [k]*matrix [i][k];
            }}
        return result;}

    static double [][] mul (double [][] matrixLeft, double [][] matrixRight) {
        double [][] result2 = new double[matrixLeft.length][matrixRight[0].length];

        for (int h =0; h < matrixRight[0].length; h++) {
                for (int i =0; i< matrixLeft.length; i++) {
                result2 [i][h] =0;
                for (int k = 0; k < matrixLeft[0].length; k++ ) {
                    result2[i][h] = result2[i][h] + (matrixRight[k][h] * matrixLeft[i][k]);
                    System.out.println("----"+ result2 [i][h]);}
                System.out.println(result2 [i][h]);
            }
        }
        return result2 ;
    }
}
