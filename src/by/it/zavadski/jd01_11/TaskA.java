package by.it.zavadski.jd01_11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskA {
    public static void main(String[] args) {
        List<String> list=new ListA<>();
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello4");
        list.add("Hello5");
        list.add("Hello6");
        list.add("Hello7");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
