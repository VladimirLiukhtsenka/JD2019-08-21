package by.it.zavadski.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter string with values separated by space");
        Scanner sc = new Scanner(System.in);
        double[] array=InOut.getArray(sc.nextLine()); //Read line from keyboard
        double[][] matrixLeft={{1,345,34},{435,776,88}};
        double[][] matrixRight={{345,567,787},{435,77,88,77}};
        double[] vector={1,2,3};

        InOut.printArray(array);
        InOut.printArray(array,"A",4 );
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        Helper.mul(matrixLeft,vector);
        Helper.mul(matrixLeft,matrixRight);
    }
}
