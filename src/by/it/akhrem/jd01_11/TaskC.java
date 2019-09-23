package by.it.akhrem.jd01_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskC {


    public static void main(String[] args) {
        Set<String> hsSet = new HashSet<>(10);
        Set<String> mySet = new SetC<>();
        System.out.println("Test Add");
        testAdd(hsSet);
        testAdd(mySet);
        System.out.println("Remove 'three'");
        testRemove(hsSet);
        testRemove(mySet);
        System.out.println("contains");
        testContains(hsSet);
        testContains(mySet);
        testSizeEmpty(hsSet);
        testSizeEmpty(mySet);
        testAddAll(hsSet);
        testAddAll(mySet);
        testRemoveAll(hsSet);
        testRemoveAll(mySet);
    }

    static void testAdd(Set<String> inpSet){
        inpSet.add("one");
        inpSet.add("two");
        inpSet.add("three");
        inpSet.add("four");
        inpSet.add("five");
        inpSet.add("six");
        inpSet.add("seven");
        System.out.println(inpSet.getClass().getName() + " " + inpSet);
    }

    static void testRemove(Set<String> inpSet) {
        inpSet.remove("three");
        System.out.println(inpSet.getClass().getName() + " " + inpSet);
    }

    static void testContains(Set<String> inpSet) {
        String s = "two";
        if (inpSet.contains(s))
            System.out.println(inpSet.getClass().getName() + " has " + s);
        else
            System.out.println(inpSet.getClass().getName() + " doesn't have " + s);
        s = "three";
        if (inpSet.contains(s))
            System.out.println(inpSet.getClass().getName() + " has " + s);
        else
            System.out.println(inpSet.getClass().getName() + " doesn't have " + s);
    }

    static void testSizeEmpty(Set<String> inpSet) {
        System.out.println(inpSet.getClass().getName() + " Size = " + inpSet.size() + " isEmpty = " + inpSet.isEmpty());
    }

    static void testAddAll(Set<String> inpSet) {
        Set<String> st = new HashSet<>(10);
        st.add("1");
        st.add("2");
        st.add(null);
        st.add("3");
        st.add("4");
        inpSet.addAll(st);
        System.out.println(inpSet);
    }

    static void testRemoveAll(Set<String> inpSet) {
        List<String> st = new ArrayList<>(10);
        st.add("four");
        st.add("five");
        st.add("six");
        st.add("seven");
        st.add("one");
        st.add("two");
        st.add("1");
        st.add(null);
        st.add(null);
        st.add("2");
        st.add("2");
        st.add("3");
        st.add("4");
        boolean b = inpSet.removeAll(st);
        System.out.println(inpSet +" " + b);
    }
}
