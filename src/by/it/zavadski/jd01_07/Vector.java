package by.it.zavadski.jd01_07;


import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;

public class Vector extends Var {
    private double[] value;
    public Vector(double[] value){
        this.value= Arrays.copyOf(value,value.length);
    }

    public Vector(Vector vector){ this.value=vector.value; }

    public Vector (String strVector){
        //StringBuilder stringBuilder=new StringBuilder(strVector);
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
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (double v : value) {
            sb.append(delimiter).append(v);
            delimiter=", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
