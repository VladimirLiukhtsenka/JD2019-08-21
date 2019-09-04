package by.it.zlotnikova.jd01_01;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k = (int) (Math.pow(i, 2) + Math.pow(j, 2));
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);
    }
}
