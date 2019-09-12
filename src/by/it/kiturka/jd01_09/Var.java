package by.it.kiturka.jd01_09;

abstract class Var implements Operation {
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
        System.out.println("Операция разности " + this + "-" + other + "невозможна");
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
        return null;
    }
}
