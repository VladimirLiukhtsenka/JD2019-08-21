package by.it.shamuradova.jd01_02;

public class DinamicInitiDvumetnogoMassiva {
    public static void main(String[] args) {

        String [] array1 = new String [3];
        int [][] array2 = new int [3][];

        //динамическая инициализация одномерного массива
        for(int i=0; i<array1.length; i++){
            array1[i]= "privet" + i;
            System.out.println(array1[i]);
        }
        //перед тем как проводить инициализацию дв массива, нужно знать каждую длинну од массива
        array2[0]= new int [5];
        array2[1]= new int [2];
        array2[2]= new int [7];

        //инициализция по столбцам и по строкам, поэтому 2 цикла
        for(int i=0; i<array2.length; i++){
            for(int j = 0; j< array2[i].length; j++){
                array2[i][j] = i+j;
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
