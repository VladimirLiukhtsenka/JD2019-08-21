package by.it.akhmelev.jd01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = step1(n);
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] step1(int n) {
        int[][] array = new int[n][n];
        boolean okMax;
        boolean okMin;
        do {
            okMax = false;
            okMin = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -n + (int) (Math.random() * (2 * n + 1));
                    if (array[i][j] == -n) okMin = true;
                    if (array[i][j] == n) okMax = true;
                }
            }
        } while (!okMax || !okMin);

        return array;
    }


    private static int[][] step3(int[][] m) {
        //findMax
        int max = Integer.MIN_VALUE;
        for (int[] row : m) {
            for (int e : row) {
                if (e > max)
                    max = e;
            }
        }

        //checkMax
        boolean[] delRow = new boolean[m.length];
        boolean[] delCol = new boolean[m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == max) {
                    delRow[i] = true;
                    delCol[j] = true;
                }
            }
        }

        //findSizeResult
        int rowCount = 0;
        for (boolean b : delRow)
            if (!b)
                rowCount++;

        int colCount = 0;
        for (boolean b : delCol)
            if (!b)
                colCount++;

        int[][] res=new int[rowCount][colCount];
        int ir=0;
        for (int i = 0; i < m.length; i++) {
            if (!delRow[i]){
                int jr=0;
                for (int j = 0; j < m[i].length; j++) {
                    if (!delCol[j]){
                       res[ir][jr]=m[i][j];
                       jr++;
                    }
                }
                ir++;
            }
        }

        return res;

    }

}
