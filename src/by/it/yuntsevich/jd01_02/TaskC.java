package by.it.yuntsevich.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        step1(n);

        int[][] mas = step1(n);
        step2(mas);

    }

    private static int[][] step1(int n) {
        int[][] mas = new int[n][n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    mas[i][j] = (int) (Math.random() * (n * 2 + 2) - n - 1);
                    if ((mas[i][j]) > max) max = (mas[i][j]);
                    if ((mas[i][j]) < min) min = (mas[i][j]);
                }
            }
        }
        while (max != n && min != -n);

        if (max == n && min == -n) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
                System.out.print("\n");
            }

        }

        return mas;
    }

    private static int step2(int[][] mas) {
        int a = 0;
        int b = 0;
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {

            }
        }

    return sum;
    }
    private static int[][] step3(int[][] m){
        int max = Integer.MIN_VALUE;
        for (int[] row : m) {
            for (int e : row) {
                if (e>max)
                max=e;
            }

        }
        boolean[] delCol = new boolean[m[0].length];
        boolean[] delRow = new boolean[m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] ==max){
                    delCol[j] = true;
                    delRow[i] = true;
                }

            }

        }
        int rowCount =0;
        for (boolean b : delRow) {
            if (!b) rowCount++;

        }
        int colCount =0;
        for (boolean b : delCol) {
            if (!b) colCount++;
        }
        int[][] res = new int[rowCount][colCount];
        int ir=0;
        for (int i = 0; i < m.length; i++) {
            if (!delRow[i]){
                int jr=0;
                for (int j = 0; j < m[i].length; j++) {
                    if(!delCol[j]){
                        res[ir][jr] = m[i][j];
                        jr++;
                    }



                }
                ir++;
            }

        }
        return res;
    }

}


