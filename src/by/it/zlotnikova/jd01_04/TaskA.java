package by.it.zlotnikova.jd01_04;

import by.it.zlotnikova.jd01_03.Helper;
import by.it.zlotnikova.jd01_03.InOut;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        buildOneDimArray(inputLine);
    }

    private static void printMulTable() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%1d*%1d=%-3d", i, j, i * j);
            }
            System.out.println();
        }
    }

    static void buildOneDimArray(String line) {
        double[] arr = InOut.getArray(line);
        double first = arr[0];
        double last = arr[arr.length - 1];
        InOut.printArray(arr, "V", 5);
        System.out.println();
        Helper.sort(arr);
        InOut.printArray(arr, "V", 4);
        System.out.println();
        int indFirst = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                indFirst = i;
                break;
            }
        }
        int indLast = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == last) {
                indLast = i;
                break;
            }
        }
        System.out.println("Index of first element=" + indFirst);
        System.out.println("Index of last element=" + indLast);
    }
}


