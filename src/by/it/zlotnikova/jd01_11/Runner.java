package by.it.zlotnikova.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        // Task A
        List<String> myList = new ListA<>();
        List<String> arrList = new ArrayList<>();
        myList.add("One"); arrList.add("One");
        myList.add("Two"); arrList.add("Two");
        myList.add("Four"); arrList.add("Four");
        System.out.println(myList.toString());
        System.out.println(arrList.toString());
        myList.add(2, "Three"); arrList.add(2, "Three");
        System.out.println(myList.toString());
        System.out.println(arrList.toString());
        myList.remove(2); arrList.remove(2);
        System.out.println(myList.toString());
        System.out.println(arrList.toString());
        myList.remove("Two"); arrList.remove("Two");
        System.out.println(myList.toString());
        System.out.println(arrList.toString());
        System.out.println(myList.get(0));
        System.out.println(arrList.get(0));
    }
}
