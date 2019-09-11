package by.it.krautsevich.jd01_09;

public abstract class Var implements Operation {

    public static Var createVar(String strVar) {
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar) ;
        if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar) ;

        return null ;
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Операция %s + %s невозможна.\n", this, other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Операция %s - %s невозможна.\n", this, other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Операция %s * %s невозможна.\n", this, other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Операция %s / %s невозможна.\n", this, other);
        return null;
    }

    @Override
    public String toString() {
        return "{abstract var}" ;
            }
}
