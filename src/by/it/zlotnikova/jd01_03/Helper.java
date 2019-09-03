package by.it.zlotnikova.jd01_03;

public class Helper {

    /**
     * @author e.zlotnikova
     * Finds the minimum value of an array of doubles.
     * @param arr the array in which the search is executed.
     * @return the double representing the minimum value of the array.
     */
    public static double findMin(double[] arr) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                arr[i] = min;
            }
        }
        return min;
    }

    /**
     * @author e.zlotnikova
     * Finds the maximum value of an array of doubles.
     * @param arr the array in which the search is executed.
     * @return the double representing the maximum value of the array.
     */
    public static double findMax(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                arr[i] = max;
            }
        }
        return max;
    }

    /**
     * @author e.zlotnikova
     * Sorts the array of doubles in ascending order.
     * @param arr the array to be sorted.
     */
    public static void sort(double[] arr) {
        int count = arr.length - 1;
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < count; i++) {
                if (arr[i] > arr[i + 1]) {
                    double buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                    flag = true;
                }
            }
            count = count - 1;
        }
        while (flag);
    }

    /**
     * @author e.zlotnikova
     * Perfoms maltiplication of a matrix by a vector.
     * @param matrix the matrix od doubles.
     * @param vector the vector of doubles.
     * @return resulting vector of doubles.
     */
    public static double[] mul(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] = result[i] + matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    /**
     * @author e.zlotnikova
     * Perfoms multiplication of 2 matrixes consisting of doubles.
     * @param matrixLeft the first (left) matrix to be multiplied.
     * @param matrixRight the second (right) matrix.
     * @return resulting matrix of doubles.
     */
    public static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] result2 = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixLeft.length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    result2[i][j] = result2[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return result2;
    }
}
