package by.it.daletski.jd01_08;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value = Arrays.copyOf (value, value.length);
    }

    public Vector(Vector vector) {
        this.value = Arrays.copyOf (vector.value, vector.value.length);
    }

    public Vector(String strVector) {
        String[] strArray = strVector.replaceAll ("\\{", "").replaceAll ("}", "").split (",");
        value = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            value[i] = Double.parseDouble (strArray[i]);
        }
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf (value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Scalar) other).getValue ();
            }
            return new Vector (res);
        } else if (other instanceof Vector) {
            double[] res = Arrays.copyOf (value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Vector) other).value[i];
            }
            return new Vector (res);
        } else
            return super.add (other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ("{");
        String delimetr = "";
        for (double element : value) {
            sb.append (delimetr).append (element);
            delimetr = ", ";
        }
        sb.append ("}");
        return sb.toString ();
    }


}
