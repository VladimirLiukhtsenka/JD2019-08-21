package by.it.liukhtenko.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> myList = new ListB<>();
        List<String> arList = new ArrayList<>();
        myList.add("First");arList.add("First");
        myList.add("Two");arList.add("Two");
        myList.add("Four");arList.add("Four");
      /*  System.out.println("add myList:"+myList+"\narList:"+arList);
        myList.add(2,"Three");arList.add(2,"Three");
        myList.add(0,"Start");arList.add(0,"Start");
        System.out.println("add() myList:"+myList+"\narList:"+arList);
        myList.remove("Start");arList.remove("Start");
        myList.remove(3);arList.remove(3);
        System.out.println("remove myList:"+myList+"\narList:"+arList);
        System.out.println("get myList (0): " + myList.get(0) + "\narlist(0): "+arList.get(0));
        System.out.println("ListB");
        myList.set(1,"test");arList.set(1,"test");
        System.out.println(myList + "\n" + arList);
              */
        myList.addAll(myList);arList.addAll(arList);
        System.out.println(myList + "\n" + arList);
    }
}
