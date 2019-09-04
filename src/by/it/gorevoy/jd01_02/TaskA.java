package by.it.gorevoy.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <mas.length ; i++) {
            mas[i] = scanner.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);

    } static void step1(int[] mas){
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i <mas.length ; i++) {

            if (max<mas[i]) max = mas[i];
            if (min>mas[i]) min = mas[i];
        }
        System.out.println(min+" "+max);
    }


   private static void step2(int[]mas){
       double avg=0;
       for (int element: mas) {
           avg=avg+element;

       }
           avg=avg/mas.length;
           for (int element : mas){
               if (element<avg)
                   System.out.print(element + " ");
           }
    }

   private static void step3(int[]mas){
       int min = mas[0];
       for (int element: mas){
           if (min >element) min=element;
       }
       for (int i = mas.length -1; i >=0 ; i--) {
           if (mas[i] == min) {
               System.out.print(i+" ");
           }

       }
}
}
