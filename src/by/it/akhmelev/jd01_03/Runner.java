package by.it.akhmelev.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double[] array = InOut.getArray(line);
        InOut.printArray(array);
        InOut.printArray(array, "A", 4);
        InOut.printArray(array, "B", 5);

        double min = Helper.findMin(array);
        System.out.println("MIN=" + min);
    }
}
