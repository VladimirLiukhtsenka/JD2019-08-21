package by.it.liukhtenko.jd01_03;

import by.it.liukhtenko.jd01_04.Helper;
import by.it.liukhtenko.jd01_04.InOut;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array,"V",3 );
        double min = Helper.findMin(array);
        double max = Helper.findMax(array);
        Helper.sort(array);
    }
}
