package by.it.liukhtenko.JD01_02;
import java.util.Scanner;
public class TaskB {
    public static void main(String[] args) {
        step1();

        System.out.println("Введте номер месяца");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        step2(month);

        System.out.println("Введите значение");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        step3(a, b, c);
    }



    static void step1() {
        int[][] mas = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    private static void step3(double a, double b, double c) {
        double dis = b*b - 4*a*c;
        if (dis<0)
            System.out.println("корней нет");
        else if(dis==0) {
            double x = -b / (2 * a);
            System.out.println(x);
        }
            else {
                double x1 = (-b + Math.sqrt(dis)) / (2*a);
                double x2 = (-b - Math.sqrt(dis)) / (2*a);
                System.out.println(x1 + " " + x2);

        }

    }

}