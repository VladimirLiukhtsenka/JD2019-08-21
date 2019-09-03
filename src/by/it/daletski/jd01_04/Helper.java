package by.it.daletski.jd01_04;

class Helper {

    static double findMin(double[] arr) {

        double min = arr[0];


        for (int i = 1; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static double findMax(double[] arr) {

        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    static void sort(double[] arr) {

        boolean upDirection = true;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((upDirection && arr[i] > arr[j]) || (!upDirection && arr[i] < arr[j])) {
                    double m = arr[i];
                    arr[i] = arr[j];
                    arr[j] = m;
                }

            }
        }

        return;
    }


    static double[] mul(double[][] matrix, double[] vector) {
        double[] z = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < vector.length; j++) {
                z[i] = z[i] + matrix[i][j] * vector[j];
            }
        return z;
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] z = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++)
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    z[i][j] = z[i][j] + (matrixLeft[i][k] * matrixRight[k][j]);

                }

            }

        return z;
    }

}