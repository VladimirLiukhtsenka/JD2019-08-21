package by.it.zavadski.calc;

abstract class Var implements Operation {
     static Var createVar(String strVar) {
         strVar=strVar.trim().replace("\\s+","");
        if(strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        if(strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        if(strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);

        return null;
    }

    @Override
    public Var add(Var other) {
        System.out.printf("Операция %s + %s невозможна",this,other);
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.printf("Операция %s - %s невозможна",this,other);
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.printf("Операция %s * %s невозможна",this,other);
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.printf("Операция %s / %s невозможна",this,other);
        return null;
    }

    public String toString(){return "Abstract class Var";}

}
