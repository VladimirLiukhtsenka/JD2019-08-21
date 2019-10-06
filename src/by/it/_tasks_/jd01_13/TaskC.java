package by.it._tasks_.jd01_13;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception{
        scanner = new Scanner(System.in);
        readData();
    }

    private static void readData() throws Exception {
        double[] numbers = new double[0];
        String line;
        double number;
        int exceptionCount = 0;
        while (scanner.hasNextLine()) {
            try {
                line = scanner.nextLine();
                number = Double.parseDouble(line);
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length - 1] =(int) number;
            } catch (Exception e) {
                exceptionCount++;
                if (exceptionCount == 5)
                    throw e;
                Thread.sleep(100);
                double[] reversedNumbers = reverseArray(numbers);
                for (double reversedNumber : reversedNumbers) {
                    System.out.print(reversedNumber + " ");
                }
            }
        }
    }

    private static double[] reverseArray(double[] numbers) {
        double[] reversedNumbers = new double[numbers.length];
        for (int i = 0; i < reversedNumbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        return reversedNumbers;
    }
}
