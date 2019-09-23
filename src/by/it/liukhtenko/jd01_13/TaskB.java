package by.it.liukhtenko.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        List<Double> ListInt = new ArrayList<>();
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        String str;
        try {


            while (!(str = sc.next()).equals("END")) {
                Double value = Double.valueOf(str);
                ListInt.add(value);
                //System.out.println(value);
            }
            for (int i = 0; i < ListInt.size(); i++) {
                sum += ListInt.get(i);
                if (sum<0) throw new ArithmeticException();
                double sqrt = Math.sqrt(sum);
                System.out.println( Math.floor(sqrt * 100.0) / 100.0);
            }
        } catch (NumberFormatException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                if (TaskB.class.getName().equals(element.getClassName())) {
                    // System.out.println(element);
                    String name = e.getClass().getName();
                    String clname = element.getClassName();
                    int number = element.getLineNumber();
                    System.out.printf("name: %s\n" + "class: %s\n" + "line: %d\n", name, clname, number);
                    break;
                }
            }
        } catch (ArithmeticException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                if (TaskB.class.getName().equals(element.getClassName())) {
                    // System.out.println(element);
                    String name = e.getClass().getName();
                    String clname = element.getClassName();
                    int number = element.getLineNumber();
                    System.out.printf("name: %s\n" + "class: %s\n" + "line: %d\n", name, clname, number);
                    break;
                }
            }
        }
    }
}