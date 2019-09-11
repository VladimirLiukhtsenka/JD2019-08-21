package by.it.rubatskii.jd01_09;

public abstract class Var implements Operation {
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
}