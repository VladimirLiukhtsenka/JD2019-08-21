package by.it.zlotnikova.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = step1(n);
    }

    private static int[][] step1(int n) {
        int[][] matrix = new int[n][n];
        boolean flag1 = false;
        boolean flag2 = false;
        while (!(flag1 && flag2)) {
            flag1 = false;
            flag2 = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int) (-n + Math.random() * (n - (-n) + 1));
                    if (matrix[i][j] == -n) {
                        flag1 = true;
                    }
                    if (matrix[i][j] == n) {
                        flag2 = true;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
