package by.it.yakimovich.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrinthMath {
    public static void main(String[] args) {
        Class<Math> structMath = Math.class;
        Method[] methods = structMath.getDeclaredMethods();
        for (Method method : methods) {
            if ((method.getModifiers() & Modifier.PUBLIC ) !=Modifier.PUBLIC)
                System.out.println(method);

        }
    }
}
