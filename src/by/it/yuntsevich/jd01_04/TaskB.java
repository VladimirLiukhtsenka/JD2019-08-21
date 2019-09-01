package by.it.yuntsevich.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] surname = new String[n];
        for (int i = 0; i < surname.length; i++) {
            surname[i] = sc.next();
        }
        int[][] salary = new int[n][4];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Введите зарплату для " + surname[i]);
            for (int j = 0; j < salary[i].length; j++) {
                salary[i][j] = sc.nextInt();

            }


        }
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-9s%-10s%-10s%-10s%-10s%-5s%n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println("-----------------------------------------------------------");
        int total = 0; int count=0;
        for (int i = 0; i < salary.length; i++) {
            System.out.printf("%7s:", surname[i]);
            int sum = 0;
            for (int j = 0; j < salary[i].length; j++) {
                sum = sum + salary[i][j];
                count+=1;
                System.out.printf("% -10d", salary[i][j]);
            }
            System.out.printf("% -5d\n", sum);
            total += sum;

        }
        double average = (double)total/count;
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-8s% -10d\n","Итого", total);
        System.out.printf("%-9s%-10.5f","Средняя",average);

    }
}


