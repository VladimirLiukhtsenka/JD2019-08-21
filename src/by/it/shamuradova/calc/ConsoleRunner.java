package by.it.shamuradova.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) throws CalcException {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
//        try {
//            Var.loadVars();
//        } catch (CalcException e) {
//            System.err.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println("The file vars.txt was not found. It will be recreated after the first variable is assigned...");
//            e.printStackTrace();
//        }
        for (; ; ) {
            String vyragenie = sc.nextLine();
            try {
                if (vyragenie.equals("end")) {
                    break;
                }
                if (vyragenie.equals("printvar")) {
                    printer.printMap(Var.getVars());
                }
                if (vyragenie.equals("sortvar")) {
                    printer.printSorted(Var.getVars());
                } else {
                    Var result = parser.calc(vyragenie);
                    printer.print(result);
                }
            } catch (CalcException e) {
                System.out.println(e.getMessage());
            }
        }
//        System.out.println("printvar");
//        Var.printVar();
//        System.out.println("sortvar");
//        Var.sortvar();
    }
}
