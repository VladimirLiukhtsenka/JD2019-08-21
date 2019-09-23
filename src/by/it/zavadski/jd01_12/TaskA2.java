package by.it.zavadski.jd01_12;

import java.util.*;

public class TaskA2 {

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result=new HashSet<>(a);
        result.addAll(b);
        return result;
    }
    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result=new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

//    private HashSet<Integer> hashSet=new HashSet<>();

//    private TreeSet<Integer> treeSet=new TreeSet<>();

    public static void main(String[] args) {
        Integer[] arrayA={1,1,2,2,3,4,5,6,6};
        Integer[] arrayB={4,4,5,5,6,6,7,8,8,9,9,9};
        Set<Integer> setA=new HashSet<>(Arrays.asList(arrayA));
        Set<Integer> setB=new TreeSet<>(Arrays.asList(arrayB));
         System.out.println(getUnion(setA,setB));
        System.out.println(getCross(setA,setB));
    }
}
