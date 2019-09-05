package by.it.krautsevich.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = step1(n);
        System.out.println("__________________" );
        for (int i = 0; i <= n-1; i++) {for (int k = 0; k < n; k++) { System.out.print(mas[i][k] + " ");} System.out.println("\n");}
    }
    private static int [][] step1(int n) {
        int[][] mas = new int[n][n];
        boolean proofMax = false;
        boolean proofMin = false;
        do {for ( int i = 0; i < n; i++) {
            for (int k = 0;
                 k <  n  ;
                 k++) {
                mas[i][k] = - n + (int) ((Math.random() * ((2 * n) + 1))); }}

            for (int i = 0; i <= n-1; i++) {
                for (int k = 0; k < n;  k++) {System.out.print(mas[i][k] + " ");}
                System.out.println("\n");}

                for ( int i = 0; i < n; i++) {
                for (int k = 0;
                     k <  n  ;
                     k++) { if (mas[i][k] == n )   proofMax = true ; }}

            for ( int i = 0; i < n; i++)
                for (int k = 0; k < n; k++) {
                    if (mas[i][k] == -n) proofMin = true;
                }}
    while (proofMax== false && proofMin==false);
    return mas;}
    }



