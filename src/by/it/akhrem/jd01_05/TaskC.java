package by.it.akhrem.jd01_05;

import by.it.akhrem.jd01_03.InOut;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {
        task6();
        //task7();
    }

    private static void task6() {
        int cntElements = 28;
        double delta = (9 - 5.33)/cntElements;
        double [] z = new double[cntElements];
        double x = 5.33;
        for (int i = 0; i < z.length && x <= 9; i++) {
            z[i] = pow(x*x + 4.5, 1.0/3);
            x +=delta;
        }
        InOut.printArray(z, "arr", 5);
        double value = 3.5;
        int cnt = getCountElementsMoreThanValue(z, value);
        if (cnt == 0) {
            System.out.printf("Array does not have elements more than %f", value);
            return;
        }
        double [] arr = new double[cnt];
        int j = 0;
        for (double i: z)
            if (i > value)
                arr[j++] = i;
        System.out.printf("Среднее геометрическое значение %f%n", getAverageGeomVal(arr));
    }

    private static int getCountElementsMoreThanValue(double arr[], double value) {
        int result = 0;
        for(double el: arr)
          if (el > value)
              result++;
        return result;
    }

    private static double getAverageGeomVal(double arr[]) {
        if (arr.length == 0)
            return  0;
        double val = 1;
        for (double x: arr)
            val *= x;
        double result = pow(val, 1.0/arr.length);
        return result;
    }

    private static void task7() {
        int [] arr = new int[31];
        for(int i =0; i< arr.length; i++)
            arr[i] = (int)(random()*348 + 103);
        printArray(arr);

        int cnt = 0;
        for (int j = 0; j<arr.length; j++) {
            if (arr[j]*0.1 > j)
                cnt++;
        }
        int x= 0;
        int [] bArr = new int[cnt];
        for (int k= 0; k<arr.length; k++) {
            if (arr[k] * 0.1 > k)
                bArr[x++] = arr[k];
        }

        printArray(bArr);
        Arrays.sort(bArr);
        printArray(bArr);

    }

    private static void printArray(int [] array) {
        for(int i=0; i<array.length; i++)
            System.out.print("["+i+"]" + array[i] + "; ");
        System.out.println();
    }
}
