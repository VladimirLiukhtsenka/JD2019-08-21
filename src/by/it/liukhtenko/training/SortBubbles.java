package by.it.liukhtenko.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortBubbles {
    public static void main(String[] args) {
        int[] mas = {2, 3, 1, 4, 8, 6, 7, 5, 9};
        for (int i =0;i<mas.length;i++){
            for (int j = i;j<mas.length;j++){
                if(mas[i]>mas[j]){
                    int temp = mas[j];
                    mas[j] = mas [i];
                    mas [i]=temp;
                }
            }
            System.out.println(Arrays.toString(mas));
        }













//        for (int i =  mas.length-1; i >=0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (mas [i]<mas[j]){
//                    int tmp = mas [i];
//                    mas [i] = mas [j];
//                    mas [j] = tmp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(mas));
    }
}
