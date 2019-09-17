package by.it.yuntsevich.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskC2 {
    private static <T> Set<T> getCross(Set<T>... args) {
        Set<T> result = new HashSet<>(args[0]);
        for (Set<T> arg : args) {
            result.retainAll(arg);
        }
        return result;

    }

    private static <T> Set<T> getUnion(Set<T>... args) {
        Set<T> result = new HashSet<>(args[0]);
        for (Set<T> arg : args) {
            result.addAll(arg);
        }
        return result;

    }

    public static void main(String[] args) {
        Double[] array1 = {1.1, 1.1, 2.0, 2.0, 3.5, 3.6, 4.8, 7.9, 10.2, 58.5};
        Set<Object> setE = new HashSet<>(Arrays.asList(array1));
//        Double[] array2 = {4, 4, 5, 5, 6, 6, 4, 58, 7, 2, 8, 9, 10};
//        Double[] array3 = {4, 4, 5, 5, 6, 6, 4, 58, 7, 2, 8, 9, 10};
        Integer[] arrayA = {1, 1, 2, 2, 3, 3, 4, 7, 10, 58};
        Integer[] arrayB = {4, 4, 5, 5, 6, 6, 4, 58, 7, 2, 8, 9, 10};
        Integer[] arrayC = {4, 4, 5, 5, 6, 6, 4, 58, 5, 8, 1, 9, 1, 4, 5, 3, 6, 4, 6658, 7, 2, 8, 9, 10};
        Integer[] arrayD = {4, 4, 5, 5, 6, 6, 4, 58, 7, 2, 8, 9, 25, 16, 19, 8, -2, 10};
        Set<Object> setA = new HashSet<>(Arrays.asList(arrayA));
        Set<Object> setB = new TreeSet<>(Arrays.asList(arrayB));
        Set<Object> setC = new TreeSet<>(Arrays.asList(arrayC));
        Set<Object> setD = new TreeSet<>(Arrays.asList(arrayD));
        System.out.println(getUnion(setA, setB, setC, setD, setE));
        System.out.println(getCross(setA, setB, setC, setD, setE)); //пустой Set, нет пересечений



    }
}
