package by.it.liukhtenko.training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReferenceOnMethod {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4);
//        number.stream().forEach(x-> System.out.println(x));
//        number.forEach(System.out::println);
        Function<String, Integer> toInteger = string -> parse(string);
        Integer integer = toInteger.apply("5");
    }

    private static Integer parse(String s) {
        return Integer.parseInt(s);
    }
}
