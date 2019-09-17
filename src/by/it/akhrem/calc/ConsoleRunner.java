package by.it.akhrem.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
        for(;;) {
            String expression = sc.nextLine();
            if (expression.equals("end")) break;
            if (expression.equals("printvar")) Var.printvar();
            Var result = parser.calc(expression);
            printer.print(result);
        }
    }
}
