package by.it.kiturka.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;


public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();

        String lastMethod = "";
        for (Method declaredMethod : declaredMethods) {
            if ((declaredMethod.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                if (!declaredMethod.getName().equals(lastMethod)){
                    lastMethod = declaredMethod.getName();
                    System.out.println(lastMethod);
                }
            }
        }
    }
}
