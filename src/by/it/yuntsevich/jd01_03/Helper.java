package by.it.yuntsevich.jd01_03;

class Helper {

    static double findMin(double[] array) {
        double min = Double.MAX_VALUE;
        for (double anArray : array) {
            if (anArray < min) min = anArray;
        }

        return min;
    }
    static double findMax(double[] array) {
        double max = Double.MIN_VALUE;
        for (double anArray : array) {
            if (anArray > max) max = anArray;
        }

        return max;
    }

    static void sort(double[] array) {
        boolean swap;
        int last = array.length - 1;
        do {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[i + 1]) {
                    double a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    swap = true;
                }
            }
            last--;
        }
        while (swap);

        InOut.printArray(array);
    }


    static double[] mul(double[][] matrix, double[] vector) {

        double result[] = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] = result[i] + matrix[i][j] * vector[j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
        return result;
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] result = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    result[i][j] = result[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                    System.out.println(result[i][j] + " ");

                }

            }

        }
        return result;
    }

}





