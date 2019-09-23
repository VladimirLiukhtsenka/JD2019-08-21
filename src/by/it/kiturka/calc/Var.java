package by.it.kiturka.calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

abstract class Var implements Operation {
    private static Map<String, Var> vars = new HashMap<>(); //в случае операции "=", вычисления не выполняются, но переменная записывается в карту
    //ключ- название переменной String, значение Scalar, Vеctor

    public static Var saveVar(String key, String varExpression) {
        Var var = createVar(varExpression);
        vars.put(key, var);

        return var;
    }

    public static void printVar() {
        for (String a : vars.keySet()) {
            System.out.println(a + "=" + vars.get(a));
        }
    }
    public static void sortvar(){
        Set<String> keys=new TreeSet<>(vars.keySet());
        for (String key : keys) {
            System.out.println(key + "="+ vars.get(key));
        }


    }

    @Override
    public String toString() {
        return "Это класс Var";
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения " + this + "+" + other + "невозможна");
        return null;
    }
    @Override
    public Var sub(Var other) {
        System.out.println("Операция разницы " + this + "-" + other + "невозможна");
        return null;
    }
    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения " + this + "*" + other + "невозможна");
        return null;
    }
    @Override
    public Var div(Var other) {
        System.out.println("Операция деления " + this + "/" + other + "невозможна");
        return null;
    }

    static Var createVar(String a){
        if (a.matches(Patterns.SCALAR)) {
            return new Scalar(a);
        }
        if (a.matches(Patterns.VECTOR)){
            return new Vector(a);
        }
        if(vars.containsKey(a)){
            return vars.get(a);
        }
        return null;
    }



}
