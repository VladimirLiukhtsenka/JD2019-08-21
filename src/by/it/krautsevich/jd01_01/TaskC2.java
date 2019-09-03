package by.it.krautsevich.jd01_01;

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
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     int i=sc.nextInt();
     int e=sc.nextInt ();
     int Sum=e + i;
     System.out.println("DEC:"+ i + "+" + e +"="+ Sum);
        System.out.println("BIN:"+ Integer.toBinaryString(i) + "+" + Integer.toBinaryString(e) +"="+ Integer.toBinaryString(Sum));
        System.out.println("HEX:"+ Integer.toHexString(i) + "+" + Integer.toHexString(e) +"="+ Integer.toHexString(Sum));
        System.out.println("OCT:"+ Integer.toOctalString(i) + "+" + Integer.toOctalString(e) +"="+ Integer.toOctalString(Sum));
    }

}
