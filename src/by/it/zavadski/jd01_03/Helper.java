package by.it.zavadski.jd01_03;

public class Helper {
    public static double findMin(double[] array) {
        double min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]< min) {
                min = array[i];
            }

        }
        System.out.printf("Min is "+min);
        return min;
    }

    static double findMax(double[] array){
        double max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

    }
        System.out.printf("Max is "+max);
        return max;}

    public static void sort(double[] array){
        for (int i = 0; i <array.length-1; i++) {
            for (int j = i+1; j <array.length; j++) {
                if (array[i]>array[j]){
                    double buffer=array[i];
                    array[i]=array[j];
                    array[j]=buffer;
                }
            }
        }
    }

    public static double[] mul(double[][] matrix,double[] vector){
        double[] multiply=new double[matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <vector.length ; j++) {
                multiply[i]=multiply[i]+matrix[i][j]*vector[j];
            }
        }
        InOut.printArray(multiply,"Vector multiplied",3);
        return multiply;
    }

    static double[][] mul(double[][] matrixLeft,double[][] matrixRight){
        double[][]multiply=new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i <matrixLeft.length ; i++) {
            for (int j = 0; j <matrixRight[0].length ; j++) {
                for (int k = 0; k <matrixRight.length ; k++) {
                    multiply[i][j]=multiply[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }

            }
            
        }
        InOut.printArray(multiply,"Matrix multiplied",3);
        return multiply;
    }
}
