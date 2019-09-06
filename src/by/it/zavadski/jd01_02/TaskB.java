package by.it.zavadski.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        step1();
        System.out.println("\nEnter month number: \n");
        int month=sc.nextInt();
        step2(month);
        System.out.println("Enter a, b, c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        step3(a,b,c);

    }

    private static void step1() {
        //int[] array25=new int[25];
        for (int i = 0; i < 25; i++) {
            System.out.print((i+1)  + " ");
           if (i == 4 || i == 9 || i == 14 || i == 19) {
        //    if (i % 5 == 0){
                System.out.println();
            }
        }
    }

    private static void step2(int month) {
        String monthName;
        switch (month){

    case 1: monthName="январь";
    break;
    case 2: monthName="февраль";
        break;
    case 3: monthName="март";
        break;
    case 4: monthName="апрель";
        break;
    case 5: monthName="май";
        break;
    case 6: monthName="июнь";
        break;
    case 7: monthName="июль";
        break;
    case 8: monthName="август";
        break;
    case 9: monthName="сентябрь";
        break;
    case 10: monthName="октябрь";
        break;
    case 11: monthName="ноябрь";
        break;
    case 12: monthName="декабрь";
        break;
    default:
        monthName=("нет такого месяца");
        break;
}
        System.out.println(monthName);
    }

    private static void step3(double a, double b, double c) {
        double discriminant;
        discriminant=b*b-4*a*c;
        if (discriminant > 0) {
            double x1=(-b-Math.sqrt(discriminant))/ (2*a);
            double x2=(-b+Math.sqrt(discriminant)) / (2*a);
            System.out.println(x1+" "+x2);
        }
        else if (discriminant==0) {
            double x = (-b) / (2*a);
            System.out.println(x);
        }
        else {
            System.out.println("корней нет");
        }
    }

}