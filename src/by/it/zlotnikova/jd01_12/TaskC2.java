package by.it.zlotnikova.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskC2 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(
                1, 2, 2, 3, 4, 5, 7, 8, 7, 8, 9));
        Set<Integer> setB = new HashSet<>(Arrays.asList(
                2, 4, 4, 5, 6, 7, 7, 8, 9, 0));
        Set<Integer> setC = new HashSet<>(Arrays.asList(
                8, 9, 10, 10, 11, 12));

        Set<String> setD = new TreeSet<>(Arrays.asList(
                "One", "Two", "Two", "Three", "Four", "Five", "Five"));
        Set<String> setE = new TreeSet<>(Arrays.asList(
                "Four", "Five", "Six", "Seven", "Seven", "Eight", "Eight"));

        System.out.println(getUnion(setA, setB, setC));
        System.out.println(getCross(setD, setE));

    }

    @SafeVarargs
    private static <T> Set<T> getUnion(Set<T>... a) {
        Set<T> result = new HashSet<>();
        for (Set<T> i : a) {
            result.addAll(i);
        }
        return result;
    }

    @SafeVarargs
    private static <T> Set<T> getCross(Set<T>... a) {
        Set<T> result = new HashSet<>();
        if (a.length > 0) {
            result.addAll(a[0]);
            for (int i = 1; i < a.length; i++) {
                result.retainAll(a[i]);
            }
        }
        return result;
    }
}
