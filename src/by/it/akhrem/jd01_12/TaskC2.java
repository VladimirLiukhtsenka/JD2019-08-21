package by.it.akhrem.jd01_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskC2 {
    public static void main(String[] args) {
        Integer[] arrayA = {1, 1, 2, 2, 3, 4, 5, 6, 6};
        Integer[] arrayB = {4, 4, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 9};
        Integer[] arrayC = {4, 4, 5, 5, 7, 7, 7, 9, 10, 11, 12};
        Set<Integer> setA = new HashSet<>(Arrays.asList(arrayA));
        Set<Integer> setB = new HashSet<>(Arrays.asList(arrayB));
        Set<Integer> setC = new HashSet<>(Arrays.asList(arrayC));
        System.out.println(getCross(setA, setB, setC));
        System.out.println(getUnion(setA, setB, setC));
        Double[] arrDblA = {1.0, 1.1, 1.3, 1.4, 1.5, 1.5, 1.6, 1.6};
        Double[] arrDblB = {1.2, 1.3, 1.4, 1.5, 2.1, 2.1, 2.3};
        Set<Double> sdA = new HashSet<>(Arrays.asList(arrDblA));
        Set<Double> sdB = new HashSet<>(Arrays.asList(arrDblB));
        System.out.println(getCross(sdA, sdB));
        System.out.println(getUnion(sdA, sdB));
    }

    private static <T> Set<T> getCross(Set<T> ...arg) {
        Set<T> result = new HashSet<>(arg[0]);
        for (int i=1; i<arg.length; i++)  {
            result.retainAll(arg[i]);
        }
        return result;
    }

    private static <T> Set<T> getUnion(Set<T> ... arg) {
        Set<T> result = new HashSet<>();
        for(Set<T> s: arg)
          result.addAll(s);
        return result;
    }
}
