package by.it.yuntsevich.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA2 {
    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b) {
        Set <Integer> result = new HashSet<>(a);
        result.retainAll(b);
//        for (Integer valueA : b) {
//            if (b.contains(valueA))
//                result.add(valueA);
//
//        }
        return result;

    }

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set <Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;

    }

    public static void main(String[] args) {
        Integer[] arrayA = {1, 1, 2, 2, 3, 3, 4,7,10,58};
        Integer[] arrayB = {4, 4, 5, 5, 6, 6,4,58, 7,2, 8, 9, 10};
        Set<Integer> setA = new HashSet<>(Arrays.asList(arrayA));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(arrayB));
        System.out.println(getUnion(setA,setB));
        System.out.println(getCross(setA,setB));

    }

}
