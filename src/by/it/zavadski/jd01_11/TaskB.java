package by.it.zavadski.jd01_11;

import java.util.List;

public class TaskB {
    public static void main(String[] args) {
        List<String> list=new ListB();
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
        list.set(2,"4");
        System.out.println(list);
    }

}
