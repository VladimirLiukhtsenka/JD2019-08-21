package by.it.yuntsevich.jd01_11;

import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public static void main(String[] args) {
//        List<String> myList = new ListB<>();
//        List<String> arList = new ArrayList<>();
//
//
//        myList.add("A"); arList.add("A");
//        myList.add("B"); arList.add("B");
//        myList.add("C"); arList.add("C");
//        myList.add("D"); arList.add("D");
//        myList.add("E"); arList.add("E");

//        System.out.println("myList: "+myList + "\narList: "+ arList );
//
//        myList.remove(1); arList.remove(1);
//
//        System.out.println("myList: "+myList + "\narList: "+ arList );
//
//        System.out.println("myList: "+myList.get(2) + "\narList: "+ arList.get(2) );
//
//        myList.add(3,"A"); arList.add(3,"A");
//        System.out.println("myList: "+myList + "\narList: "+ arList );
//
//        myList.set(3,"B"); arList.set(3,"B");
//        System.out.println("myList: "+myList + "\narList: "+ arList );


//        arList.addAll(arList);
//        System.out.println(arList);

//        myList.addAll(arList);
//        System.out.println(myList);

        Set<Integer> mySet = new SetC<>();
        Set<Short> hashSet = new HashSet<>();
        mySet.add(15);
      //  hashSet.add(15);
        mySet.add(1);
        hashSet.add((short)1);
        mySet.add(10);
        hashSet.add((short)10);

        System.out.println(mySet);
//        System.out.println(hashSet.contains((short)5));
    System.out.println(mySet.contains(100));


    }
}
