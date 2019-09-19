package by.it.akhmelev.calc2;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser=new Parser();
        Printer printer = new Printer();
        for (; ; ) {
            String expression = sc.nextLine();
            if (expression.equals("end")) break;
            try {
                Var result = parser.calc(expression);
                printer.print(result);
            } catch (CalcException | ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
