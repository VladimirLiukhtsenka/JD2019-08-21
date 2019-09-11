package by.it.krautsevich.jd01_07;

public class Scalar extends Var {

    private double value ;
    public Scalar() {};

    public Scalar(double value) {
        this.value = value;}

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value ;}

    public Scalar (String stringValue) {
        this.value = Double.valueOf(stringValue) ;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
