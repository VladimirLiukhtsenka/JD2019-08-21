package by.it.zlotnikova.jd01_01;

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
        Scanner sc = new Scanner(System.in);
        //      System.out.println("Введите i:");
        int i = sc.nextInt();
//        System.out.println("Введите j:");
        int j = sc.nextInt();
        System.out.println("Ввод:\n" + i + " " + j + '\n');
        System.out.println("Вывод:\n" + "Sum = " + (i + j));
    }


}
