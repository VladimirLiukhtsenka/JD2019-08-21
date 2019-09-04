package by.it.zavadski.jd01_03;

import java.util.Arrays;

public class InOut {
    public static double[] getArray(String line) {
        line=line.trim();
        String[] split = line.split(" ");
        double[] array=new double[split.length];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            array[i]=Double.parseDouble(split[i]);
        }
        return  array;
    }
    public static void printArray(double [] array){
        for (double element : array){
            System.out.println(element+" ");
        }
        System.out.println();
    }

    public static void printArray(double [] array, String name, int colsCount){
        for (int i = 0; i <array.length ; i++) {
            System.out.printf("%s[% -3d]=%-8.3f ",name,i,array[i]);
            if ((i+1) % colsCount==0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void printArray(double [][] array, String name, int colsCount){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {

            System.out.printf("%s[% -3d]=%-8.3f ",name,i,array[i][j]);
            if ((i+1) % colsCount==0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }}
}
