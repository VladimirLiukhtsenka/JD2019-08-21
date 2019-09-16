package by.it.shamuradova.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.reflect.Modifier.PUBLIC;
import static java.lang.reflect.Modifier.STATIC;

//класс выводит нак консоль все публичные поля и методы класса Math
public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;  //получаем класс Math
        Method[] methods = mathClass.getMethods(); //помещаем все его методы в массив
        for (Method method : methods) {
            StringBuilder stringBuilder = new StringBuilder();
            if ((method.getModifiers() & PUBLIC) == PUBLIC) {//получаем модификаторы и выясняем какие из методов публичные
                //System.out.println(method);
                stringBuilder.append("public ");
            }
            if ((method.getModifiers() & STATIC) == STATIC) {
                stringBuilder.append("static ");
            }

            stringBuilder.append(method.getReturnType()).append(" ");
            stringBuilder.append(method.getName());
            stringBuilder.append("(");

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i == parameterTypes.length - 1) {
                    stringBuilder.append(parameterTypes[i].getSimpleName());
                } else {
                    stringBuilder.append(parameterTypes[i].getSimpleName()).append(",");
                }
//            for (Class<?> parameter : parameterTypes) {
//                stringBuilder.append(parameter.getSimpleName()).append(",");
//            }
                //System.out.println(stringBuilder.append(")"));
            }
            System.out.println(stringBuilder.append(")"));
            //int last = stringBuilder.length()-1;
            //int prelast = stringBuilder.length()-2;
            //if(stringBuilder.substring(prelast, last+1).equals(stringBuilder.substring(prelast, last+1))){
             //  stringBuilder.deleteCharAt(last);
            //}


        }
        System.out.println("______________");

        Field[] fields = mathClass.getFields();
        for (Field field : fields) {
            StringBuilder stringField = new StringBuilder();
            if ((field.getModifiers() & PUBLIC) == PUBLIC) {
                stringField.append(field.getType().getSimpleName()).append(" ");
                stringField.append(field.getName());
            }
            System.out.println(stringField);
        }
    }
}



