package by.it.zavadski.jd01_01;

import java.util.Locale;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    final static double MARS_GRAVITY=3.86;
    final static double EARTH_GRAVITY=9.81;
    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter weight of man (kg):");
        int i=scan.nextInt();
        double result=getWeight(i);
        String formattedResult=String.format(Locale.US,"%.2f",result);
        System.out.println("Mars weight: \n" + formattedResult);

    }
    public static double getWeight(int weight) {
        double m=3.86/9.81;
        double m100=m*100;
        double delta=m100-(int)m100;

        if (delta < 0.5) {
            return  ((int) m100/ 100.0);}
            else {
                return ((int) (m100+1) /100.0);
            }

//        double diff=EARTH_GRAVITY / MARS_GRAVITY;
//        double marsWeight=weight / diff;
//        return marsWeight;

    }

}
