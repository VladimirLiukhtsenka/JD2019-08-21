package by.it.zlotnikova.jd01_04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empNumber = sc.nextInt();
        System.out.println("Введите фамилии сотрудников");
        String[] empList = new String[empNumber];
        for (int i = 0; i < empNumber; i++) {
            empList[i] = sc.next();
        }

        int[][] salaries = new int[empNumber][4];
        int[] empTotal = new int[empList.length];
        int total = 0;
        for (int i = 0; i < empList.length; i++) {
            System.out.println("Введите зарплату для " + empList[i]);
            for (int j = 0; j < 4; j++) {
                salaries[i][j] = sc.nextInt();
                empTotal[i] = empTotal[i] + salaries[i][j];
            }
            total = total + empTotal[i];
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2",
                "Квартал3", "Квартал4", "Итого");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < empList.length; i++) {
            System.out.printf("%-10s%-10d%-10d%-10d%-10d%-10d%n", empList[i]+":", salaries[i][0], salaries[i][1],
                    salaries[i][2], salaries[i][3], empTotal[i]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s%-10d%n", "Итого", total);
        System.out.printf("%-10s%-10.4f%n", "Средняя", ((double) total/(empNumber*4)));
    }
}