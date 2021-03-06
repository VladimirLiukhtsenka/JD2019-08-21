package by.it.agadzhanov.jd01_011_calculator4;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        Parser parser = new Parser();
        Printer printer = new Printer();

        while (!(line = scanner.nextLine()).equals("end")) {
            if (line.equals("printvar")) {
                Var.printVar();
                continue;
            }
            if (line.equals("sortvar")) {
                Var.sortVar();
                continue;
            }
            Var result = parser.calc(line);
            printer.print(result);
        }
    }
}
