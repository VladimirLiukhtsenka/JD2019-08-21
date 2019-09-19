package by.it.yuntsevich.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();


        for(;;) {
            String expression = sc.nextLine();
            try {
                if (expression.equals("end")) break;
                if (expression.equals("printvar")) {
                    printer.printMap(Var.getVars());
                }
                if (expression.equals("sortvar")) {
                    printer.printSorted(Var.getVars());
                }

                Var result = parser.calc(expression);
                if (result != null) printer.print(result);
            }
            catch(CalcException e){
                System.out.println(e.getMessage());            }
        }

    }
}
