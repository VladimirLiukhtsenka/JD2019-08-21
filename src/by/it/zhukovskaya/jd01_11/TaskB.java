package by.it.zhukovskaya.jd01_11;


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
        list.add("Привет1");
        list.add("Привет2");
        list.add("Привет3");
        list.add("Привет4");
        list.add("Привет5");
        list.add("Привет6");
        System.out.println("1) " + list);
        list.add(3, "3Привет7");
        list.add(3, "3Привет8");
        list.add(3, "3Привет9");
        System.out.println("2) " + list);
        List<String> list1=  new ArrayList<>();
        list1.add("Пока1");
        list1.add("Пока2");
        list1.add("Пока3");
        list1.add("Пока4");
        list.addAll(list1);
        System.out.println("3) " +list);
        list.remove(3);
        System.out.println("4 remove index=3) " +list);
        System.out.println("5 get(3)=" + list.get(3));
        list.set(4, "Hi");
        System.out.println("6 set 4 'Hi' " + list);
    }

}
