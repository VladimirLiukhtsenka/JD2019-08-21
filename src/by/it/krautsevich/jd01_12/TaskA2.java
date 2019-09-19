package by.it.krautsevich.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskA2 {

    private static Set <Integer> getUnion (Set <Integer> a, Set <Integer> b) {
        Set <Integer> result = new HashSet<>(a) ;
        result.addAll(b) ;
        return result ;
    }

    private static Set <Integer> getCross (Set <Integer> a, Set <Integer> b) {
        Set <Integer> result = new HashSet<>(a) ;
        result.retainAll(b) ;

        return result ;
    }

    public static void main(String[] args) {
        Integer [] arrayA = {1,2,4,3,33,65,67,56,90,100} ;
        Integer [] arrayB = {2,3,4,5,6,7,89,34,33,1,76,8,8,8} ;

        Set <Integer> setA = new HashSet<>(Arrays.asList(arrayA)) ;
        Set <Integer> setB = new HashSet<>(Arrays.asList(arrayB)) ;

        System.out.println("Union = " + getUnion(setA , setB));
        System.out.println("Cross = " + getCross(setA , setB));






    }
}
