package by.it.shamuradova.jd01_09;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Parser parser=new Parser();
        Printer printer=new Printer();
        for(;;) {
            String vyragenie = sc.nextLine();
            if(vyragenie.equals("end")){
                break;
            }
            else {
                Var result = parser.calc(vyragenie);
                printer.print(result);
            }
        }
    }
}
