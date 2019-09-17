package by.it.yakimovich.jd01_03;

 class Helper {
    static double findMin(double[] arr) {
        double min = Double.MAX_VALUE;
        for (double element : arr) {
            if (element < min) min = element;
        }
        return min;

    }

    static double findMax(double[] arr) {
        double max = Double.MIN_VALUE;
        for (double element : arr) {
            if (element > max) max = element;
        }
        return max;
    }
     static void sort(double[ ] arr){
        boolean swap= false;
        double last;
        while(!swap) {
            swap = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap = false;

                    last = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = last;
                }
            }
        }

     }

     public static double[] mul(double[][] matrix, double[] vector) {
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
     }

