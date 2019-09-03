package by.it.yuntsevich.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

import static by.it.yuntsevich.jd01_04.Helper.*;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        buildOneDimArray(line);
    }
        static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d",i,j,i*j);

            }
            System.out.println();
        }


        }
        static void buildOneDimArray(String line){
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V",5);
        double first = array[0];
        double last = array[array.length-1];
        sort(array);
            InOut.printArray(array, "V",4);

            System.out.println("Index of first element="+Arrays.binarySearch(array,first));
            System.out.println("Index of last element="+Arrays.binarySearch(array,last));

        }


    }

