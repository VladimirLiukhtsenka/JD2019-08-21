package by.it.daletski.jd01_11;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

        //checkA
        List<String> myListA = new ListA<> ();
        List<String> arrListA = new ArrayList<> ();
        myListA.add ("1");
        arrListA.add ("1");
        myListA.add ("2");
        arrListA.add ("2");
        myListA.add ("4");
        arrListA.add ("4");
        System.out.println (myListA.toString ());
        System.out.println (arrListA.toString ());
        myListA.add (2, "3");
        arrListA.add (2, "3");
        System.out.println (myListA.toString ());
        System.out.println (arrListA.toString ());
        myListA.remove (2);
        arrListA.remove (2);
        System.out.println (myListA.toString ());
        System.out.println (arrListA.toString ());
        myListA.remove ("3");
        arrListA.remove ("3");
        System.out.println (myListA.toString ());
        System.out.println (arrListA.toString ());
        System.out.println (myListA.get (0));
        System.out.println (arrListA.get (0));

        //checkB
        List<String> myListB = new ListB<> ();
        List<String> arrListB = new ArrayList<> ();
        myListB.add ("1");
        arrListB.add ("1");
        myListB.add ("2");
        arrListB.add ("2");
        myListB.add ("4");
        arrListB.add ("4");
        System.out.println (myListB.toString ());
        System.out.println (arrListB.toString ());
        myListB.remove (1);
        arrListB.remove (1);
        System.out.println (myListB.toString ());
        System.out.println (arrListB.toString ());
        System.out.println (myListB.get (0).toString ());
        System.out.println (arrListB.get (0).toString ());
        myListB.set (0, "4");
        arrListB.set (0, "4");
        System.out.println (myListB.toString ());
        System.out.println (arrListB.toString ());
        myListB.add (1, "Second");
        arrListB.add (1, "Second");
        System.out.println (myListB.toString ());
        System.out.println (arrListB.toString ());
        List<String> list = Arrays.asList ("5", "6", "7", "8");
        myListB.addAll (list);
        arrListB.addAll (list);
        System.out.println (myListB.toString ());
        System.out.println (arrListB.toString ());
    }
}



