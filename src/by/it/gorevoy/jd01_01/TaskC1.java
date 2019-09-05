package by.it.gorevoy.jd01_01;

//это лишние импорты. удаляю, т.к. сборка ломается на других PC
//import jdk.swing.interop.SwingInterOpUtils;
//import java.sql.SQLOutput;
//Хмелев.

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два слогаемых числа ");
        int i  =  scan.nextInt();
        int x  =  scan.nextInt();
        int z = i + x;
        System.out.println("Вы ввели числа: "+i +"+"+ x+" Сумма этих чисел = ");
        System.out.println("Sum = "+z);



    }





}
