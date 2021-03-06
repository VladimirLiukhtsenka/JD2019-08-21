package by.it.rojas.jd07;


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

}
