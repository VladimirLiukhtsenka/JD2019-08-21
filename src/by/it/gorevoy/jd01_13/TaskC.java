package by.it.gorevoy.jd01_13;


import java.util.*;

import static java.util.Collections.*;

public class TaskC {
    /**
     * TaskC. Нужно написать в TaskC программу, которая будет вводить вещественные числа с
     * консоли, после каждой ошибки программа делает паузу в 100 мс и выводит накопленные числа в
     * обратном порядке.
     *  Используйте Scanner, но он должен создаваться только один раз и обязательно в методе main.
     *  Код по чтению чисел с клавиатуры должен быть в методе static void readData().
     *  Если пользователь ввёл какой-то текст, вместо ввода числа, то метод readData() должен перехватить
     * исключение, сделать паузу Thread.sleep(100) и вывести на экран все ранее введенные числа.
     *  Числа нужно выводить без форматирования, через пробел, в порядке обратном вводу.
     *  После 5 допущенных ошибок программа должна завершиться, пробрасывая ошибку в JVM.
     */
    private static int errorCount=0;
    private static String input;
    private static List<Double> list= new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        while(errorCount!=5){
            input=scanner.nextLine();
         readData();
        }
    }
    private static void readData() throws Exception {
            try {
                double inputValue=Double.parseDouble(input);
                list.add(inputValue);

            }
            catch (NumberFormatException e) {
                if(errorCount==5)
                   throw new Exception("Wrong input 5 times",e);
                else
                errorCount++;
                Thread.sleep(100);
                for (int i = list.size()-1; i >=0 ; i--){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
    }
}}

