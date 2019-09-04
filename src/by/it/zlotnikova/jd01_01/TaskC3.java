package by.it.zlotnikova.jd01_01;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ввод:");
        int weightEarth = sc.nextInt();
        getWeight(weightEarth);
//        System.out.println("Вывод:" + '\n' + weightMars);
        System.out.println(getWeight(weightEarth));
    }

    static double getWeight(int weightEarth) {
        double weight = weightEarth / 9.81 * 3.86;
        double weight1 = weight * 100;
        int weightRound = 0;
        if ((weight1 - (int) weight1) < 0.5) {
            weightRound = (int) weight1;
        } else {
            weightRound = (int) weight1 + 1;
        }
        double newWeightMars = weightRound / 100.0;
        return newWeightMars;
    }
}
