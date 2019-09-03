package by.it.yuntsevich.jd01_05;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        step1();
        step2();

    }

    private static void step1() {
        double[] array = new double[30];
        int i = 0;
        int colsCount = 5;
        System.out.println("Массив A");
        for (double x = 5.33; x <= 9; x += ((9 - 5.33) / array.length)) {
            double z = Math.pow((x * x + 4.5), 1 / 3.0);
            array[i] = z;
            System.out.printf("%s[% -3d]=%-8f ", "A", i, array[i]);
            if ((i + 1) % colsCount == 0) {
                System.out.println();
            }
            i++;
        }
        System.out.println();

        int count = 0;
        for (double anArray : array) {
            if (anArray > 3.5)
                // System.out.println(j);
                count++;
        }
        System.out.println("Массив B");
        double[] array2 = new double[count];
        int l = 0;
        for (int k = 8; k < array.length; k++) {
            array2[l] = array[k];
            System.out.printf("%s[% -3d]=%-8f ", "B", l, array2[l]);
            if ((l + 1) % colsCount == 0) {
                System.out.println();
            }
            l++;
        }
        System.out.println();

        double product = 1;
        for (double element : array2) {
            product = product * element;
        }
        System.out.println("Geometric mean of the array B = " + Math.pow(product, 1.0 / array2.length));
    }

    private static void step2() {
        int [] arrayA = new int[31];
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) ((Math.random() * 348 + 103));
            System.out.print(arrayA[i] + " ");
            if (arrayA[i] * 0.1 > i)
                count++;

        }
        System.out.println();
        int [] arrayB = new int [count];
        int j = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] * 0.1 > i){
                arrayB[j]=arrayA[i];
            j++;}
            else continue;
        }
        Arrays.sort(arrayB);
        for (int element : arrayB) {
            System.out.print(element +" ");

        }
        System.out.println();

        for (int i = 0; i < arrayA.length; i++) {

            System.out.printf("%s%s%s%s%s%s%s%s%s\n%s%s[% -3d]=% d%s ", "\u2554","\u2550","\u2550","\u2550","\u2550","\u2550","\u2550","\u2550","\u2566","\u2551", "A",i,arrayA[i],"\u2551" );
        }


    }
}



