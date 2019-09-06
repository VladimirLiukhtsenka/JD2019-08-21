package by.it.zavadski.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step4();
        step5();
    }

    private static void step4() {
            double y=0;
        for (double a = 0; a <=2; a=a+0.2){
        for (int x = 1; x <=6; x++) {
            y+= (pow(7, a)-cos(x));
        }
            System.out.printf("For a=%.2f Sum=%g\n", a, y);
        }
    }

    private static void step5() {
        double beta=0;
        double x=0;
        boolean solutionExist;

        for ( x =-5.5; x <2 ; x+=0.5) {
            if ((x / 2) > -2 && ((x / 2) <= -1)) {
                    beta = sin(x * x);
            solutionExist = true;
        }
            else if ((x/2)>-1&&((x/2)<0.2)) {
                beta = cos(x * x);
                solutionExist = true;
            }
            else if((x/2)==0.2) {
                beta = 1 / tan(x * x);
                solutionExist = true;
            }
            else {
                solutionExist=false;
            }

            if (solutionExist==true){
                double alpha=log10(abs(beta+2.74));
                System.out.printf("При x/2=%3.2f alpha=%g\n",x / 2,alpha);
            }
            else {
                System.out.printf("При x/2=%3.2f вычисления не определены\n",x/2);
            }
        }

    }
}
