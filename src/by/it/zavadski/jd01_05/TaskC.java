package by.it.zavadski.jd01_05;
import java.util.Random;

import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {
        step6();
        step7();
    }

    private static void step6() {
        Random random = new Random();
        double[] randomArray = new double[20 + random.nextInt(20)];
        double[] compareArray = new double[randomArray.length];

        int i = 0;
        double z=0;
        double diff = ((9 - 5.33) / (randomArray.length - 1));
        for (double x = 5.33; x <= 9; x += diff) {
            z = cbrt(x * x + 4.5);
            randomArray[i] = z;
            if (z > 3.5) {
                compareArray[i]=z;
            }
            System.out.printf("random[%-2d]=%-8g\n", i, randomArray[i]);
            i++;
        }
        double sum=0;
        double arithmeticSum=0;
        for (int j = 0; j <compareArray.length; j++) {
            sum+=compareArray[j];
            arithmeticSum=sum/compareArray.length;
                    }
        System.out.printf("Arithmetic Summary is %.4f\t\n",arithmeticSum);

    }



    private static void step7() {
    }
}
