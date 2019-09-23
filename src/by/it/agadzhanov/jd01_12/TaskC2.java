package by.it.agadzhanov.jd01_12;

import java.util.*;

public class TaskC2 {
/**
    public static void main(String[] args) {
        TreeSet<Double> treeSet = new TreeSet<>(Arrays.asList(1.0,2.0,3.99,4.0,4.0,4.20,5.0,5.0,6.0,6.0));
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(9,8,7,4,4,4,5,5,6,6));
        HashSet<Double> hashSet2 = new HashSet<>(Arrays.asList(100.1,8.0,7.0,-4.4,4.0,4.0,0.5,5.0,9.0,6.0));
        System.out.println(getUnion(treeSet,hashSet,hashSet2));
        //System.out.println(getCross(treeSet,hashSet));
    }

    private static Set<Double> getUnion(Set<? extends Number> ...sets) {
        Set<Double> result =(Set<Double>) sets[0];
        for (Set<? extends Number> set : sets) {
            result.addAll((Set<Double>) set);
        }
        return result;
    }

    private static Set<Integer> getCross(Set<Integer> one,Set<Integer> two) {
        Set<Integer> result = new HashSet<>();
        Iterator<Integer> iterator = one.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (two.contains(value))
                result.add(value);
        }
        return result;
    }*/
}
