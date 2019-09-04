package by.it.krautsevich.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        System.out.println("Введите число сотрудников");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String [] lastnames = new String[n];
        System.out.println();
        System.out.println("Введите фамилию " + "1");
        lastnames [0] = sc.nextLine();

        for (int k = 0; k < n; k++) {
            System.out.println("Введите фамилию "+ (k+1));
            System.out.println("-----");
            /* без следующей строчки не получается ввести первую фамилию */
            lastnames [k] = sc.nextLine();}

        /* здесь заполняем зарплаты*/

        int [][] pay = new int [n][4];

        for (int i = 0; i < n ; i++) {
            System.out.println("Введите 4 числа зарплаты через пробел " + lastnames [i]);
            String line = sc.nextLine();
            String [] strArr = line.split(" ");
            int [] rez = new int[4];
            for (int j = 0; j < 4 ; j++) {
                rez [j] =  Integer.valueOf(strArr[j]);}
            pay [i] = rez ;}

        /* здесь посчитаем итого*/
        int [] itogo = new int [n] ;
        for (int h=0; h < n ; h++) {
                itogo [h] = pay [h][0] + pay [h][1]+ pay [h][2]+ pay [h][3] ;

        }

        /* начинаем выводить результат */

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s", "Фамилия", "Квартал 1","Квартал 2", "Квартал 3","Квартал 4", "Итого");
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s", lastnames[i], pay [i][0], pay [i][1], pay [i][2], pay [i][3], itogo [i] );
            System.out.println( );

        }

        int itogoSum =0 ;
        for (int i = 0; i < n; i++) {
            itogoSum= itogoSum + itogo [i] ;}

        double zer = itogoSum ;

        double itogoAverage = (zer/(n*4));
        System.out.println("----------------------------------------------------");

        System.out.println();

        System.out.printf("%-10s%-10s", "итого", itogoSum);
        System.out.println();
        System.out.printf("%-10s%-10.4f", "Средняя", itogoAverage);

    }



    }

