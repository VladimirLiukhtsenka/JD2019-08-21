package by.it.zlotnikova.jd01_13;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        double newEntry;
        double sum = 0;
        double sqrt;
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            try {
                newEntry = Double.parseDouble(line);
                sum = sum + newEntry;
                sqrt = Math.sqrt(sum);
                if (Double.isNaN(sqrt)) {
                    throw new ArithmeticException("Can't sqrt from value: " + sum);
                }
                System.out.println(newEntry + ", " + sqrt);
            } catch (ArithmeticException | NumberFormatException e) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                for (StackTraceElement element : stackTrace) {
                    if (TaskB.class.getName().equals(element.getClassName())) {
                        System.out.println(" name: " + e.getClass().getName() + '\n' +
                                "class: " + element.getClassName() + '\n' +
                                " line: " + element.getLineNumber());
                        break;
                    }
                }
            }
        }
    }
}
