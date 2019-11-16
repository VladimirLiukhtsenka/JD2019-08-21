package by.it.liukhtenko.training.javaClasses;

import java.util.Arrays;

public class VariableArguments {
    private void method (int ... values){
        if(values.length !=0){
            System.out.println(Arrays.toString(values));
        }
        else {
            System.out.println("without values");
        }
    }
    public static void main(String[] args) {
        VariableArguments v = new VariableArguments();
        v.method(12,34,12,34);
    }
}
