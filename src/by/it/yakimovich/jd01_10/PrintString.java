package by.it.yakimovich.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {

        Class<String> stringClass = String.class;
        Method[] Methods = stringClass.getDeclaredMethods();
        for (Method method : Methods) {
            int modif = method.getModifiers();
            if(!(Modifier.isStatic(modif)))
            {
                System.out.println(method.getName());
            }
        }
    }
}
