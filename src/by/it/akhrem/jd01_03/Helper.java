package by.it.akhrem.jd01_03;

/**
 * класс Helper test
 */
class Helper {
    /**
     * Функция нахождения минимального элемента массива
     */
    static double findMin(double[] arr) {
        double min = arr[0];
        for (double x : arr)
            if (min > x)
                min = x;
        return min;
    }


    /**
     * Функция нахождения максимального элемента массива
     */
    static double findMax(double[] arr) {
        double max = arr[0];
        for (double x : arr)
            if (max < x)
                max = x;
        return max;
    }

    /**
     * Сортировка массива методом пузырька
     */
    static void sort(double[] arr) {
        boolean swap;
        int last = arr.length - 1;
        do {
            swap = false;
            for (int j = 0; j < last; j++) {
                if (arr[j] > arr[j + 1]) {
                    double buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                    swap = true;
                }
            }
            last--;
        } while (swap);
    }

    /**
     * умножение матрицы на вектор
     */
    static double[] mul(double[][] matrix, double[] vector) {
        double[] z = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < vector.length; j++)
                z[i] = z[i] + matrix[i][j] * vector[j];
        return z;
    }

    /**
     * умножение матрицы на матрицу
     */
    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] z = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++)
            for (int j = 0; j < matrixRight[0].length; j++)
                for (int k = 0; k < matrixRight.length; k++)
                    z[i][j] = z[i][j] + matrixLeft[i][k] * matrixRight[k][j];
        return z;
    }
}
