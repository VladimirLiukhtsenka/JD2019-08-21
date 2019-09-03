package by.it.krautsevich.jd01_02;

import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        int min = -n;
        int z = (int) (Math.random() * (2*n+1) + n);
        System.out.println(z);

    }
}
