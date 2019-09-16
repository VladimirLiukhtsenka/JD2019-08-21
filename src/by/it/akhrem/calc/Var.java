package by.it.akhrem.calc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation {

    private static Map<String, Var> vars = new HashMap<>();

    static Var saveVar(String name, Var var) {
        vars.put(name, var);
        return var;
    }

    public static void printvar(){
        for(Map.Entry<String, Var> entry: vars.entrySet())
            System.out.println(entry.getKey()+"=" + entry.getValue());
    }


    static Var createVar(String strVar) {
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        if (vars.containsKey(strVar))
            return vars.get(strVar);
        return null;
    }

    @Override
    public String toString() {
        return "{Abstract var}";
    }

    @Override
    public Var add(Var other) {
        System.out.println("Operation " + this + " + " + other + "unavailable\n");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Operation " + this + " - " + other + "unavailable\n");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Operation " + this + " * " + other + "unavailable\n");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Operation " + this + " / " + other + "unavailable\n");
        return null;
    }
}
