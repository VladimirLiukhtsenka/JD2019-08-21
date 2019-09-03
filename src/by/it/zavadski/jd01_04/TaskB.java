package by.it.zavadski.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNumber = sc.nextInt();
        String[] surnames=new String[peopleNumber];
        for (int i = 0; i <peopleNumber ; i++) {
            surnames[i]=sc.next();
        }
        int[][] salary = new int[peopleNumber][4];
        for (int i = 0; i <peopleNumber; i++) {
            System.out.println("Enter salary for "+surnames[i]);
            for (int k = 0; k <4 ; k++) {
                salary[i][k]=sc.nextInt();
            }
        }
paystub(salary,surnames,peopleNumber);
    }

    public static void paystub(int[][] salary,String[] surnames,int peopleNumber){

        int allSum=0;
        for (int i = 0; i <peopleNumber ; i++) {
            allSum=allSum+salary[i][0]+salary[i][1]+salary[i][2]+salary[i][3];
            }
        double avg=(double)allSum / ((double)peopleNumber*4);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-9s%-10s%-10s%-10s%-10s%-7s%n","Фамилия","Квартал1","Квартал2","Квартал3","Квартал4","Итого");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i <surnames.length ; i++) {
            System.out.printf("%-15s%-10d%-10d%-10d%-10d%-7d%n",surnames[i],salary[i][0],salary[i][1],salary[i][2],salary[i][3],(salary[i][0]+salary[i][1]+salary[i][2]+salary[i][3]));
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Summary: "+allSum);
        System.out.printf("%s %.4f","Среднее: ",avg);
        }

    }


