package by.it.zavadski.jd01_09;


import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class Matrix extends Var {
    private double[][] value;

    public double getValue(int i, int j) {
        return value[i][j];
    }

    Matrix(double[][] value) {
        double[][] neededMatrix=new  double[value.length][value[0].length];
        for (int i = 0; i <neededMatrix.length ; i++)
            System.arraycopy(value[i],0,neededMatrix[i],0,neededMatrix[0].length);
                this.value=neededMatrix;
    }

    public Matrix(Matrix matrix){
        this.value = matrix.value;
    }

     Matrix(String strMatrix){
         //String[] numbers=strMatrix.replaceAll("\\{\\{","").replaceAll("\\}\\}","").replaceAll("\\}\\,\\{","").split(",");
         Pattern number=Pattern.compile("[\\d\\.\\d]");
         Matcher matcher=number.matcher(strMatrix);

        double[][] matrixAppended=new double[0][0];
         while (matcher.find()){

         }

        this.value=matrixAppended;
        }



    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("{");
        String delimiter=("");
        for (int i = 0; i <value.length ; i++) {
            stringBuilder.append("{");
            for (int j = 0; j <value[i].length ; j++) {
                stringBuilder.append(delimiter).append(value[i][j]);
                delimiter=", ";

            }
            stringBuilder.append("}");
            if(i+1 < value.length)
                stringBuilder.append(", ");
            delimiter="";
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            Matrix result=new Matrix(value);
            double scalarValue=((Scalar) other).getValue();
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]+=scalarValue;
                }
            }
            return new Matrix(result);
        }else  if(other instanceof Matrix){
            Matrix result=new Matrix(value);
            double[] matrixValue;
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]+=((Matrix) other).getValue(i,j);
                }
            }
            return new Matrix(result);
        }else
            return super.sub(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            Matrix result=new Matrix(value);
            double scalarValue=((Scalar) other).getValue();
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]-=scalarValue;
                }
            }
            return new Matrix(result);
        }else  if(other instanceof Matrix){
            Matrix result=new Matrix(value);
            double[] matrixValue;
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]-=((Matrix) other).getValue(i,j);
                }
            }
            return new Matrix(result);
        }else
            return super.sub(other);

    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            Matrix result=new Matrix(value);
            double scalarValue=((Scalar) other).getValue();
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]=result.value[i][j]*scalarValue;
                }
            }
            return new Matrix(result);
        }else  if(other instanceof Matrix){
            Matrix result=new Matrix(value);
            double scalarValue=((Scalar) other).getValue();
            //double[] matrixValue;
            for (int i = 0; i <result.value.length; i++) {
                for (int j = 0; j <result.value.length ; j++) {
                    result.value[i][j]=result.value[i][j]*scalarValue;
                }
            }
            return new Matrix(result);
        }else
            return super.sub(other);
    }

}
