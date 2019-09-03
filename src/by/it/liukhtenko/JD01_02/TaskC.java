package by.it.liukhtenko.JD01_02;
import java.util.Scanner;
public class TaskC {
    public static void main(String[] args) {

        System.out.println("Ввод");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mas = new  int[n][n];
        mas =step1(n);

        int sum;
        sum =step2(mas);
    }



    private static int[][] step1(int n) {
        boolean min = false;
        boolean max = false;
        int [][] mas = new int[n][n];
       // while (true)
        for (int i = 0; i < mas.length; i++)
        {
            for (int j = 0; j < mas.length; j++)
            {
                mas[i][j] = (int) (Math.random() * (2*n +1)- (n+1));
                mas[0][0] = n;
                if (i==n-1 && j ==n-1) {
                    mas[n - 1][n - 1] = -n;
                }
                if (mas[i][j] == n) {
                    max = true;
                }
                if (mas [i][j]==-n){
                    min=true;
                }
                if (max == true && min == true) {
                    for (int i1 = 0; i1 < mas.length; i1++) {
                        for (int j1 = 0; j1 < mas.length; j1++) {
                            System.out.print(mas[i1][j1] + " ");
                        }
                        System.out.print("\n");
                    }
                    return mas;
                }
            }
        }
        return mas;
    }

    private static int step2 (int[][] mas) {
        int s = 0;
        for (int i = 0; i <mas.length; i++) {
            int p1 = -1;
            int p2 = -1;

            for (int j = 0; j <mas.length ; j++) {
                if (mas[i][j]>0 && p1 == -1 ){
                     p1 = j;
                }
                if (mas[i][j]>0 && p1 !=-1&& j!=p1){
                    p2 = j;
                    break;
                }
            }
            if (p1 !=-1 && p2 != -1){
                for (int j = p1+1; j <p2; j++) {
                    s += mas[i][j];
                    
                }
            }


        }
        System.out.println(s);
        return s;
    }
    }
