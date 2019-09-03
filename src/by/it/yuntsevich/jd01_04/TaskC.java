package by.it.yuntsevich.jd01_04;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        buildOneDimArray(line);
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        mergeSort(array);
        InOut.printArray(array, "V", 4);

        System.out.println("Index of first element=" + binarySearch(array, first));
        System.out.println("Index of last element=" + binarySearch(array, last));

    }

    private static int binarySearch(double[] array, double value) {

        int left = 0;
        int right = array.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) return middle;
            else if (array[middle] > value) right = middle - 1;
            else left = middle + 1;
        }

        return -1;
    }


    private static void mergeSort(double[] array){
        double[] result = mergeSort(array,0,array.length-1);
        System.arraycopy(result,0,array,0,array.length);
    }
    private static double[] mergeSort(double[ ] array, int left, int right){
        if (right<=left)
            return array;

        int mid = (left+right)/2;
        double[] part1 = new double[mid+1-left];
        System.arraycopy(array,left,part1,0,part1.length);
        double[] part2 = new double[right-mid];
        System.arraycopy(array,mid+1,part2,0,part2.length);
        mergeSort(part1);
        mergeSort(part2);
        return merge(part1,part2);
    }
    private static double[ ] merge(double[ ] part1, double[ ] part2){
        int i1 =0;
        int i2 =0;
        int i =0;
        double[] result = new double[part1.length+part2.length];
        while (i<result.length) {
            if (i2 == part2.length || (i1 < part1.length && part1[i1] < part2[i2]))
                result[i++] = part1[i1++];
            else result[i++] = part2[i2++];
        }
        return result;
    }

}


