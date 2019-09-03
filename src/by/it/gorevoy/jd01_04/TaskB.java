package by.it.gorevoy.jd01_04;
import java.util.*;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int piople = scanner.nextInt();             //Количество Людей введеное со сканера.(piople)
        String[] family = new String[piople];       //Имя людей .(family)
        int[][] matrix = new int[piople][4];        //Двумерный Массив зарплат [n][4].Matrix
        int[] titl = new int[piople];
        for (int i = 0; i < family.length; i++) {
            family[i] = scanner.next();              //прогнали и запомнили людей


        }
        for (int i = 0; i < piople; i++) {
            System.out.println("Введите зарплату для " + family[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < piople; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                titl[i] = titl[i] + matrix[i][j];


            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("фамилия   ");
        String[] kvr = new String[4];
        for (int i = 0; i < kvr.length; i++) {
            System.out.print(kvr[i] = "квартал" + (i + 1) + "  ");
        }
        System.out.println("Итого");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < family.length; i++) {
            System.out.printf("%-10s", family[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-10d", matrix[i][j]);
            }
            System.out.printf("%-12d", titl[i]);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        double titlFortheyaear = 0;
        for (int i = 0; i < titl.length; i++) {
            titlFortheyaear = titlFortheyaear + titl[i];
        }
        System.out.println("Итого     " + titlFortheyaear);

        int colZp = 0;
        for (int i = 0; i < matrix.length; i++) {
            colZp = colZp + matrix[i].length;
        }
        double aver = (double) (titlFortheyaear / colZp);
        System.out.printf("Средняя: %4f", aver);

    }

    static int sum(int number) {
        if (number == 1) return number;
        return number + sum(number - 1);
    }
}



