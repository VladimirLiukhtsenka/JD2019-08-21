package by.it.yuntsevich.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();

      //  ArrayList<String> demo= new ArrayList <>();
      //  Map<String, Var> vars = new HashMap<>();

        for(;;){
            String expression = sc.nextLine();

          //  demo.add(expression);
            if(expression.equals("end")) break;
//            else if (expression.equals("printvar")){
//                demo.remove(demo.size()-1);
//                demo.forEach(it -> System.out.println(it));
//                break;
//            }

            Var result = parser.calc(expression);
            printer.print(result);
        }
    }
}
