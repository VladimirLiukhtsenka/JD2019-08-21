package by.it.zhukovskaya.jd01_13;


import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (; ; ) {
            String str = sc.nextLine();
            if (str.equals("END")) break;
            double num;
            try {
                num = Double.parseDouble(str);
                System.out.println(num);
            } catch (NumberFormatException e) {
                num = 0;
                printException(e);
            }
            sum += num;
            try {
                double sqr;
                if (sum < 0)
                    throw new ArithmeticException();
                else
                    sqr = Math.sqrt(sum);
                System.out.println(sqr);
            } catch (ArithmeticException ex) {
                printException(ex);
            }
        }
    }

    static void printException(Exception e) {
        Class<? extends Exception> clazz = e.getClass();
        String name = clazz.getName();
        StackTraceElement[] trace = e.getStackTrace();
        for (StackTraceElement element : trace) {
            String className = element.getClassName();
            if (className.contains("TaskB")) {
                int lineNumber = element.getLineNumber();
                System.out.printf(" name: %s\n " +
                        " class: %s\n" +
                        " line: %s\n", name, className, lineNumber);

            }
        }
    }
}
