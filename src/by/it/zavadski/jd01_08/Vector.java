package by.it.zavadski.jd01_08;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vector extends Var {
    private double[] value;
     Vector(double[] value){
        this.value= Arrays.copyOf(value,value.length);
    }

    public Vector(Vector vector){ this.value=vector.value; }

     Vector (String strVector){
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher=pattern.matcher(strVector);
        String[] arrayDigits=new String[strVector.length()];
        int index=0;
        while (matcher.find()){
            arrayDigits[index]=matcher.group();
            index++;
        }
        double[] arrayDouble=new double[index];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i]=Double.parseDouble(arrayDigits[i]);
        }
        this.value=arrayDouble;

    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("{");
        String delimiter="";
        for (double v : value) {
            stringBuilder.append(delimiter).append(v);
            delimiter=", ";
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
