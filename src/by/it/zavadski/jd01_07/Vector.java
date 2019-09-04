package by.it.zavadski.jd01_07;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

public class Vector extends Var {
    private double[] value;
    public Vector(double[] value){
        this.value= Arrays.copyOf(value,value.length);
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
