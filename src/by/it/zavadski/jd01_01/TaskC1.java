package by.it.zavadski.jd01_01;


/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/

import java.util.Scanner;

class TaskC1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int i=scan.nextInt();
        System.out.println("Enter 2nd number");
        int j=scan.nextInt();
        System.out.println("Sum = "+(i+j));

    }





}
