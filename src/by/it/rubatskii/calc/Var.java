package by.it.rubatskii.calc;

import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation {

    //private  static Map<String.Var> map = new HashMap<>();
    @Override
    public String toString() {
        return  "{Abstract var}";
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

     static Var createVar(String strVAr) {
        if (strVAr.matches(Patterns.SCALAR))
        return new Scalar(strVAr);
        if (strVAr.matches(Patterns.VECTOR))
            return new Vector(strVAr);
        if (strVAr.matches(Patterns.MATRIX))
            return new Matrix(strVAr);

        return null;
    }

    static void save(String name, Var var) {
       // map.put(name,var);
    }
}