package by.it.liukhtenko.training.lambda;

import java.util.StringJoiner;

public class MyExample {

    public static void main(String[] args) {
        Interface<Integer> inter;
        inter = (x1, x2) -> x1 + x2;
        inter = (x3,x4)-> x3*x4;
//        System.out.println(inter.sum(1, 2));
//        new Thread(()-> inter.sum(1,2)).start();
        System.out.println(inter.sum(1,3));
//        StringJoiner stringJoiner = new StringJoiner(".");
//        stringJoiner.add("sds");
//        stringJoiner.add("sds");
//        System.out.println(stringJoiner);
//        System.out.println(Math.pow(9,0.5));
    }

    @FunctionalInterface
    public interface Interface<T> {
        int sum(T a, T b);
    }
}
