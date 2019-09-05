package by.it.krautsevich.jd01_01;

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
import java.util.Scanner;

class TaskC3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      int    weight=sc.nextInt();
      double   MyMarsWeight;
      double Mars_g =3.86;
      double Earth_g =9.81;


      MyMarsWeight = getWeight(weight);
      System.out.println( MyMarsWeight);
          }
    private static double getWeight(int  weight) {
        double i100;
        i100 = weight *100*3.86/9.81;
        double  i1000 = (weight* 1000 * 3.86) / 9.81;
        double MyMarsWeight;
        if (        ( (int) i1000 - ((int) i100)*10 ) >= 5  )

            MyMarsWeight = (((int) i100)+1) * 0.01 ;


        else MyMarsWeight = ((int) i100) * 0.01 ;







        return MyMarsWeight;


















    }
}



