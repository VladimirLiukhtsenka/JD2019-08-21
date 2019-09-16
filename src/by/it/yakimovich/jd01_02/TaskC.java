package by.it.yakimovich.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        step1(n);

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
}
