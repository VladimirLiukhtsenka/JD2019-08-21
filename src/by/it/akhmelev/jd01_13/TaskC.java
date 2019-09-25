package by.it.akhmelev.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC {

    private static Scanner scanner;
    private static List<Double> list = new ArrayList<>();
    private static int errorCounter = 0;

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        for (; ; ) {
            readData();
        }
    }

    private static void readData() {
        String strValue = scanner.next();

        try {
            Double value = Double.valueOf(strValue);
            list.add(value);
        } catch (NumberFormatException e) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            errorCounter++;
            if (errorCounter > 5) {
                throw e;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

}
