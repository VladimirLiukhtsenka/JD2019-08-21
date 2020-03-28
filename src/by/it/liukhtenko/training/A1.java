package by.it.liukhtenko.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A1 {
    public static void main(String[] args) {
        int page = 3;
        int recordsPerPage = 5;
        List<Integer> list = new ArrayList<>();
        List<Integer> listPage = new ArrayList<>();
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
        list.add(11);
        int start = (page - 1) * recordsPerPage;
        for (int i = start; i < start + recordsPerPage && i < list.size(); i++) {
            listPage.add(list.get(i));
        }
        System.out.println(listPage);
    }
}


