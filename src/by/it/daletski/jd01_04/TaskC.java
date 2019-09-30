package by.it.daletski.jd01_04;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine ();
        buildOneDimArray (line);

    }

    public static void buildOneDimArray(String line) {

        double[] array = InOut.getArray (line);
        double start = array[0];
        double stop = array[array.length - 1];
        InOut.printArray (array, "V", 5);
        Helper.sort (array);
        InOut.printArray (array, "V", 4);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == start) {
                System.out.println ("Index of first element=" + i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == stop) {
                System.out.printf ("Index of last element=" + i);
                break;
            }
        }


    }


    static int mergeSort(double[] array, int left, int right) {
        double d = array[right];
        int sort = 0;
        for (int i = left+1; i <=right ; i++) {
            if (array[i]<d){
                array[i] = array[sort+1];
        }
        array[i] = array[sort];
        }
        return sort;
    }

}