package by.it.akhmelev.calc3;

import java.util.Scanner;

public class ConsoleRunner {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
        try {
            Var.loadVars();
        } catch (CalcException e) {
            System.out.println("File vars.txt not found. Recreated.");
        }
        for (; ; ) {
            try {
                String expression = sc.nextLine();
                if (expression.equals("end"))
                    break;
                Var result = parser.calc(expression);
                printer.print(result);
                if (expression.contains("="))
                    Var.saveVars();
            } catch (CalcException | ArithmeticException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
