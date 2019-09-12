package by.it.liukhtenko.jd01_09;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        Parser parser = new Parser();
        Printer printer = new Printer();

      //  System.out.println(sc.nextLine());

        while (!(line = sc.nextLine()).equals("end")){
            Var result = parser.calc(line);
          //  System.out.println("L");
            printer.print(result);
        }
    }
}
