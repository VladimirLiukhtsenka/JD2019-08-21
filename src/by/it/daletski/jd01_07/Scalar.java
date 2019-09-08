package by.it.daletski.jd01_07;

public class Scalar extends Var {

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf (value);
    }

}
