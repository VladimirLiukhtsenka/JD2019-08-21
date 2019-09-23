package by.it.zlotnikova.jd01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int zeroPosition = 0;

        Scanner sc = new Scanner(System.in);
        String line;
        while (!(line = sc.next()).equals("end")) {
            Integer newValue = Integer.valueOf(line);
            if (newValue < 0) {
                list.add(newValue);
            } else if (newValue == 0) {
                list.add(zeroPosition, newValue);
            } else {
                list.add(zeroPosition, newValue);
                zeroPosition++;
            }
        }
        System.out.println(list);
    }
}
