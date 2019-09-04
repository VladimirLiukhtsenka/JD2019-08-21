package by.it.liukhtenko.jd01_04;

public class Helper {
    public static double findMin(double[] arr) {
        // double min = 0;
        if (0 == arr.length) {
            return Integer.MIN_VALUE;
        } else {
            double min = arr[0];
            for (double element : arr) {
                if (min > element)
                    min = element;
            }
            return min;
        }
    }

    public static double findMax(double[] arr) {
        if (0 == arr.length) {
            return Integer.MAX_VALUE;
        } else {
            double max = arr[0];
            for (double element : arr) {
                if (max < element)
                    max = element;
            }
            return max;
        }
    }
    public static void sort(double[] arr){
        boolean swap;
        int last = arr.length -1;
        do {
            swap = false;
            for (int j = 0;j<last;j++){
                if (arr[j]>arr[j+1]){
                    double buffer = (double) arr [j];
                    arr [j] = arr[j+1];
                    arr[j+1] = buffer;
                    swap = true;

                }
            }
            last--;
        }
        while (swap);
    }
}