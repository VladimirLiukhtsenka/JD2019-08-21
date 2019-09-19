package by.it.akhmelev.calc1;

import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation{


    private static Map<String,Var> map=new HashMap<>();

    @Override
    public Var add(Var other) {
        System.out.printf("Операция %s + %s невозможна.\n",this,other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Операция %s - %s невозможна.\n",this,other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Операция %s * %s невозможна.\n",this,other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Операция %s / %s невозможна.\n",this,other);
        return null;
    }

    @Override
    public String toString() {
        return "{Abstract var}";
    }

    static Var createVar(String strVar) {
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        if (map.containsKey(strVar))
            return map.get(strVar);
        return null;
    }

    static void save(String name, Var var) {
        map.put(name,var);
    }
}
