package by.it.akhmelev.calc2;

import java.util.HashMap;
import java.util.Map;

public abstract class Var implements Operation{


    private static Map<String, Var> map=new HashMap<>();

    @Override
    public Var add(Var other)  throws CalcException{
        String message = String.format("Операция %s + %s невозможна.\n", this, other);
        throw new CalcException(message);
    }

    @Override
    public Var sub(Var other)  throws CalcException{
        String message = String.format("Операция %s - %s невозможна.\n",this,other);
        throw new CalcException(message);
    }

    @Override
    public Var mul(Var other) throws CalcException{
        String message = String.format("Операция %s * %s невозможна.\n", this, other);
        throw new CalcException(message);
    }

    @Override
    public Var div(Var other) throws CalcException {
        System.out.printf("Операция %s / %s невозможна.\n",this,other);
        String message = String.format("Операция %s + %s невозможна.\n", this, other);
        throw new CalcException(message);
    }

    @Override
    public String toString() {
        return "{Abstract var}";
    }

    static Var createVar(String strVar) throws CalcException {
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        if (map.containsKey(strVar))
            return map.get(strVar);
        throw new CalcException(" unknow expression: "+strVar);
    }

    static void save(String name, Var var) {
        map.put(name,var);
    }
}
