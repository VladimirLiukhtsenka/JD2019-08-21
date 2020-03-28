package by.it.liukhtenko.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 class MedicalCraft<T> {
     public interface BinaryOperator<T> {
         T apply(T t1, T t2);
         static void P(){
             System.out.println("P");
         }
         default void def(){
             System.out.println("def");
         }
     }

}
public class LambdaApp implements MedicalCraft.BinaryOperator {
    public static void main(String[] args) {
        MedicalCraft.BinaryOperator<Integer> multiply = (x, y) -> x*y;
        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20
        MedicalCraft.BinaryOperator.P();
        LambdaApp lambdaApp = new LambdaApp();
        lambdaApp.def();
}

    @Override
    public Object apply(Object t1, Object t2) {
        return null;
    }
}












































