package by.it.daletski.jd01_04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int numberOfPerson = sc.nextInt ();
        String[] name = new String[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            name[i] = sc.next ();

        }

        int arr[][] = new int[numberOfPerson][4];
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println ("Введите зарплату для " + name[i]);
            for (int j = 0; j < 4; j++) {
                if (!sc.hasNext ()) break;
                arr[i][j] = Integer.parseInt (sc.next ());
            }
        }

        for (int i = 0; i < numberOfPerson; i++)
            for (int j = 0; j < 4; j++) {
                System.out.println ("[" + i + "," + j + "] = " + arr[i][j]);

            }





    }


}
