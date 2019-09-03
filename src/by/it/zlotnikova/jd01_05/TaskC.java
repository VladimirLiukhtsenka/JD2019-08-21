package by.it.zlotnikova.jd01_05;

import by.it.zlotnikova.jd01_03.InOut;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {
        taskC1();
//        taskC2();
    }

    private static void taskC1() {
        int count1 = (int) (20 + Math.random() * (40 - 20 + 1));
        double[] array1 = new double[count1];
        double[] tempArray = new double[count1];
        double x = 5.33;
        double deltaX = (9 - 5.33) / (count1 - 1);
        int j = 0;
        for (int i = 0; i < count1; i++) {
            double z = pow((pow(x, 2) + 4.5), 1.0 / 3);
            array1[i] = z;
            x += deltaX;
            if (z > 3.5) {
                tempArray[j] = array1[i];
                j ++;
            }
        }
        InOut.printArray(array1, "A", 5);
        System.out.println();

        double[] array2 = new double[j];
        System.arraycopy(tempArray, 0, array2, 0, j);
        InOut.printArray(array2, "B", 5);
        System.out.println();

        double gMean = array2[0];
        for (int k = 1; k < j; k++) {
            gMean = gMean * array2[k];
        }
        gMean = gMean / j;
        System.out.println("Среднее геометрическое массива 2 = " + gMean);
    }

    private static void taskC2() {
        int[] array1 = new int[31];
        int[] tempArray = new int[31];
        int j = 0;
        for (int i = 0; i < 31; i++) {
            array1[i] = (int) (103 + Math.random() * ((450 - 103) + 1));
            if ((0.1 * array1[i]) > i) {
                tempArray[j] = array1[i];
                System.out.println(i + " " + array1[i] + " OK");
                j++;
            } else {
                System.out.println(i + " " + array1[i]);
            }
        }
        int[] array2 = new int[j];
        System.arraycopy(tempArray, 0, array2, 0, j);
        Arrays.sort(array2);

        // to do: print out

    }
}
