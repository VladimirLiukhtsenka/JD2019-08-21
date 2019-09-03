package by.it.zavadski.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int i=scan.nextInt();
        System.out.println("Enter 2nd number");
        int j=scan.nextInt();
        int sum=i+j;
        String ihex=String.format("%x", i);
        String jhex=String.format("%x",j);
        String sumhex=String.format("%x",sum);
        System.out.println("DEC:"+i+"+"+j+"="+sum);
        System.out.println("BIN:"+Integer.toBinaryString(i)+"+"+Integer.toBinaryString(j)+"="+Integer.toBinaryString(sum));
        System.out.println("HEX:"+ihex+"+"+jhex+"="+sumhex);
        System.out.println("OCT:"+Integer.toOctalString(i)+"+"+Integer.toOctalString(j)+"="+Integer.toOctalString(sum));

    }


}
