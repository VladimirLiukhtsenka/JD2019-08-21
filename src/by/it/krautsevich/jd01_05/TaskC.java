package by.it.krautsevich.jd01_05;


import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {

        TaskC1();
    }

    private static void TaskC1() {

        int numStep = 27;
        double [] mass = new  double [numStep] ;
        double step = (9.0-5.33)/(numStep - 1) ;
        int numOfMass =0;
        double x0= 5.33 ;
        for (double i=0 ; i <(numStep - 1) ; i++) {
            double z = pow((x0+i*step)*(x0+i*step)+4.5, 1/3.0);
            mass [numOfMass] = z;
            numOfMass++;}
        mass [numStep-1] = pow(9*9+4.5, 1/3.0) ;

         /* закончили заполнять массив результатами вычислений, сейчас будем выводить его */

        for (int i = 0; i <= numStep - 1; i++) {
            System.out.printf("%-3s %-2d %-4s %-15.12f", "[A" , i , "]=" , mass[i]);
            System.out.println();
        }

        /* закончили выводить. сейчас будем считать количество элементов в новом массиве (условие z > 3.5) */

        int numOfNewMass = 0;
        for (int i =0; i <= numStep -1; i++ ) {
            if (mass [i] > 3.5) {numOfNewMass++;}}

        System.out.println("число элементов в новом массиве = " + numOfNewMass);

         /* создаем новый массив из элементов, удовл. условию */

        double [] newMass = new double[numOfNewMass] ;
        int k = 0;
        for (int i = 0; i <= numStep - 1; i++) {
                        if (mass [i] > 3.5) {
                newMass [k] = mass [i] ;
                k++ ; }
        }

        /* на всякий случай и его выведем*/

        for (int i =0; i <= numOfNewMass - 1; i++ ) {
            System.out.printf("%-3s %-2d %-4s %-15.12f", "[B" , i , "]=" , newMass[i]);
            System.out.println();
        }

        /* ищем среднее геометрическое*/

        double geo1 = 1;
        for (int i = 0; i < numOfNewMass; i++) {
          geo1 = geo1 * newMass[i]  ;
        }

        double geo = pow (geo1, 1.0/numOfNewMass);

        System.out.printf("среднее геометрическое =" + geo);



        }

    }

