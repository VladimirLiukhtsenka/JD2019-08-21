package by.it.akhrem.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class TaskB {
    public static void main(String[] args) {
        List<String> list=  new ListB<>();
        test(list);
        List<String> arrList = new ArrayList<>();
        test(arrList);
    }

    static void test(List<String> list){
        list.add("Hello1");
        list.add("Hello2");
        list.add("Hello3");
        list.add("Hello4");
        list.add("Hello5");
        list.add("Hello6");
        System.out.println("1) " + list);
        list.add(3, "3Hello7");
        list.add(3, "3Hello8");
        list.add(3, "3Hello9");
        System.out.println("2) " + list);
        List<String> list1=  new ArrayList<>();
        list1.add("GoodBye1");
        list1.add("GoodBye2");
        list1.add("GoodBye3");
        list1.add("GoodBye4");
        list.addAll(list1);
        System.out.println("3) " +list);
        list.remove(3);
        System.out.println("4 remove index=3) " +list);
        System.out.println("5 get(3)=" + list.get(3));
        list.set(4, "Hi");
        System.out.println("6 set 4 'Hi' " + list);
    }


}
