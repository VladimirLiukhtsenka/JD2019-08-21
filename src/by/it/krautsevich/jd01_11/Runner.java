package by.it.krautsevich.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
  /*    List<String> myList = new ListA<>() ;
        List<String> arList = new ArrayList<>() ;

       myList.add("123");
        myList.add("two");
        myList.add("three");
        myList.add("4our");
        System.out.println("myList " + myList);

        arList.add("123");
        arList.add("two");
        arList.add("three");
        arList.add("4our");
        System.out.println("arList " + arList);

        myList.add(3 , "new 4");
        arList.add(3 , "new 4");

        System.out.println(myList);
        System.out.println(arList);

        myList.remove(0) ;
        arList.remove(0) ;
        System.out.println("myList after remove" + myList);
        System.out.println("arList after remove" + arList);
        myList.remove("4our") ;
        arList.remove("4our") ;

        System.out.println("myList after remove" + myList);
        System.out.println("arList after remove" + arList);

        System.out.println(myList.get(1));
        System.out.println(arList.get(1));  */

        List<String> myList2 = new ListB<>() ;
        List<String> arList2 = new ArrayList<>() ;
        List<String> plus = new ArrayList<>() ;
        plus.add("size");
        plus.add("newMark") ;

        myList2.add("123");
        myList2.add("two");
        myList2.add("three");
        myList2.add("4our");
        myList2.addAll(plus) ;

        arList2.add("123");
        arList2.add("two");
        arList2.add("three");
        arList2.add("4our");
        arList2.addAll(plus) ;

        System.out.println(myList2);
        System.out.println(arList2);








    }
}
