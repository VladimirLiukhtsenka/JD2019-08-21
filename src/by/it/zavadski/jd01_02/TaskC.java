package by.it.zavadski.jd01_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N for matrix size");
        int n=sc.nextInt();
        step1 (n);
        step2(step1(n));
        step3(step1(n));

    }
    public static int[][] step1(int n){
        Random rand = new Random();
        int[][] array=new int[n][n];
        int randomNumber;
        int numbers=2*n+1; //size of array with values
        int max=n;
        int [] arrayNumbers=new int[numbers];
        for (int i = 0; i < arrayNumbers.length ; i++) {
            arrayNumbers[i]=max;
                max--;
          //      System.out.print(masNumbers[i]+" ");
            }
       // System.out.println();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                randomNumber=rand.nextInt(numbers);
                array[i][j]=arrayNumbers[randomNumber];
                if (array[i][j]!=n||array[i][j]!=(-n))
                {
                    randomNumber=rand.nextInt(numbers);
                    array[i][j]=arrayNumbers[randomNumber];
                System.out.print(array[i][j]+"\t");
        }
            else {
                //System.out.println(array);
            }}
           System.out.println();
        }

        return array;
    }

    public static int step2(int[][] mas) {
        int[] sumArray=new int [mas.length];
        int sum=0;
        for (int i = 0; i <mas.length;i++) {
            for (int j = 0; j <mas[i].length; j++) {
            if (mas[i][j]>0){
                sumArray[i]=mas[i][j];
               // System.out.print(sumArray[i]+" ");
                }
            }}
            for (int k = 0; k <sumArray.length ; k++) {
            sum=sum+sumArray[k];
            }
        System.out.println("Summary: "+ sum);
return sum;
    }
public static int[][] step3(int[][] mas){
        int max=Integer.MAX_VALUE;
        for(int[] row : mas){
            for(int e: row){
                if (e>max){
                    max=e;
                }
            }
        }

        boolean[] delCol=new boolean[mas[0].length];
        boolean[] delRow=new boolean[mas.length];

    for (int i = 0; i < mas.length; i++) {
        for (int j = 0; j <mas[i].length ; j++) {
            if(mas[i][j]==max){

                delRow[i]= true;
                delCol[j]=true;
            }
        }
    }
    int rowCount=0;
    int colCount=0;
    for(boolean b:delCol)
        if (!b)
            colCount++;
    for(boolean b: delRow)
        if(!b)
            rowCount++;

  int[][] resultMatrix=new int[rowCount][colCount];
  int ir=0;
  int jr=0;
    for (int i = 0; i <mas.length; i++) {
        if(!delRow[i]){
            for (int j = 0; j <mas[i].length; j++) {
                resultMatrix[ir][jr]=mas[i][j];
                jr++;
            }
            ir++;
        }
    }
    System.out.println(Arrays.toString(resultMatrix));
        return resultMatrix;
}


}
