package by.it.zlotnikova.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "m", 3);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
//        Helper.mul(matrix1, array);
//        Helper.mul(matrix1, matrix2);
        }
    }


