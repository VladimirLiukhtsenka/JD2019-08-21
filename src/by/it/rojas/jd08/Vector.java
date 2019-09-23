package by.it.rojas.jd08;


import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(double[] value) {

        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    public Vector(Vector vector) {
        this.value = vector.value;
    }
    Vector (String StrVector){
        StrVector = StrVector.substring(1,StrVector.length()-1);
        String [] converter = StrVector.split(",");
        value = new double[converter.length];
        for (int i=0; i<converter.length;i++){
            value[i] = Double.parseDouble(converter[i]);
        }

    }

    @Override
    public Var add(Var other) {
        if(other instanceof  Scalar){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] + ((Scalar) other).getValue();
            }
            return new Vector(res);
        }
        else if (other instanceof Vector){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] + ((Vector) other).value[i];
        }
        return  new Vector(res);
        }
        else return super.add(other);
    }

    @Override
    public Var sub (Var other) {
        if(other instanceof  Scalar){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] - ((Scalar) other).getValue();
            }
            return new Vector(res);
        }
        else if (other instanceof Vector){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] - ((Vector) other).value[i];
            }
            return  new Vector(res);
        }
        else return super.add(other);
    }

    @Override
    public Var mul (Var other) {
        double v = 0;
        if(other instanceof  Scalar){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] * ((Scalar) other).getValue();
            }
            return new Vector(res);
        }
        else if (other instanceof Vector){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] * ((Vector) other).value[i];
                v = v + res[i];
            }
            return new Scalar( v);
        }
        else return super.add(other);
    }

    @Override
    public Var div (Var other) {
        if(other instanceof  Scalar){
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length ; i++) {
                res [i] = res [i] / ((Scalar) other).getValue();
            }
            return new Vector(res);
        }
        else return super.add(other);
    }
}
