package by.it.akhmelev.calc1;

public class Scalar extends Var {

    private double value;

    public double getValue() {
        return value;
    }

    public Scalar(double value) {
        this.value = value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double result = this.value + ((Scalar) other).value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double result = this.value - ((Scalar) other).value;
            return new Scalar(result);
        }
        return new Scalar(-1).mul(other.sub(this));
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double result = this.value * ((Scalar) other).value;
            return new Scalar(result);
        }
        return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            double result = this.value / ((Scalar) other).value;
            return new Scalar(result);
        }
        return super.div(other);
    }

    public Scalar(Scalar otherScalar) {
        this.value = otherScalar.value;
    }

    public Scalar(String stringValue) {
        value = Double.valueOf(stringValue);
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
