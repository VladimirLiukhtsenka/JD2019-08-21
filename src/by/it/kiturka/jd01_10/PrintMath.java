package by.it.kiturka.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structcMath = Math.class;
        Method[] methods = structcMath.getDeclaredMethods();
        for (Method method:methods) {
            if ((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC)
                System.out.println(method);
            
        }
    }
}
