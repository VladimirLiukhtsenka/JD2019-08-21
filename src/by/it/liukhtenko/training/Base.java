package by.it.liukhtenko.training;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Base implements Serializable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        while (list.size() != 1) {
            System.out.println(list);
            List<Integer> listTmp = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i = i + 2) {
                int sum = list.get(i) + list.get(i + 1);
                listTmp.add(sum);
            }
            if (list.size() % 2 != 0) {
                listTmp.add(list.get(list.size() - 1));
            }
            list = listTmp;
        }
        System.out.println(list);
    }
}

