package by.it.zlotnikova.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA2Help {
    public static void main(String[] args) {
        Integer[] arrA = {1, 2, 2, 3, 4, 5, 7, 8, 7, 8, 9};
        Integer[] arrB = {2, 4, 4, 5, 6, 7, 7, 8, 9, 0};
        Set<Integer> setA = new HashSet<>(Arrays.asList(arrA));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(arrB));
        System.out.println(getUnion(setA, setB));
        System.out.println(getCross(setA, setB));

    }

    private static Set<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    private static <T> Set<T> getUnion2(Set<T>... a) {
        Set<T> result = new HashSet<>();
        // TODO: 22.09.2019 implement this
        return result;
    }

    private static Set<Integer> getCross(Set<Integer> a, Set<Integer> b){
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    private static <T> Set<T> getCross2(Set<T>... a){
        Set<T> result = new HashSet<>();
        // TODO: 22.09.2019 implement this
        return result;
    }


}
