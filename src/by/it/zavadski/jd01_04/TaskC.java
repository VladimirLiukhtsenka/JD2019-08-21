package by.it.zavadski.jd01_04;
import by.it.zavadski.jd01_03.Helper;
import by.it.zavadski.jd01_03.InOut;
import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {

    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        Helper.sort(array);
        InOut.printArray(array, "V", 4);
        int firstIndex = Arrays.binarySearch(array, first);
        int lastIndex = Arrays.binarySearch(array, last);
        System.out.printf("Index of first element=%1d%n", firstIndex);
        System.out.printf("Index of last element=%1d%n", lastIndex);
    }
    static int binarySearch(double[ ] array, double value){
return 1;
    }
    static void mergeSort(double[] array) {
//    double[] result=mergeSort(array,0,array.length-1);
//    System.arraycopy(result,0,array,0,array.length);
    }

    static int mergeSort(double[] array, int left, int right) {
        double x = array[right];
        int j = 0;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < x) {
                array[i] = array[j + 1];
            }
            array[i] = array[j];
        }
        return j;
    }

    static void merge(double[] part1, double[] part2) {

    }

    int getItem(double[] a, int l, int r) {
        double x = a[l];
        int j = 1;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] < x) {
                a[i] = a[j + 1];
            }
            a[l] = a[j];
        }
        return j;
    }

}

