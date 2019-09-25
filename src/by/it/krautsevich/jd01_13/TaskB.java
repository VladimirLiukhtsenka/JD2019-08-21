package by.it.krautsevich.jd01_13;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        try {
            double sum = 0;
        for ( ;; )
            {String line = sc.next() ;
            if (line.equals("END")) break;
            double i = Double.valueOf(line) ;
            if (i<0) {throw new ArithmeticException() ;}
            sum = sum +i ;
            Double root = Math.sqrt(sum);
                System.out.printf("Последнее число равно " + i + " корень будет " + root + " \n");
            }
            }
        catch (ArithmeticException | NumberFormatException e) {
            StackTraceElement [] trace = e.getStackTrace() ;
            for (StackTraceElement element : trace) {
                String className = element.getClassName() ;
                if (className.contains("TaskB")) {
                    String name = e.getClass().getName();
                    int clazzNumber = element.getLineNumber() ;

                    System.out.printf(" name: %s\n"
                            + " class: %s\n"
                            + " line: %d\n", name , className , clazzNumber);}
        }}
}}
