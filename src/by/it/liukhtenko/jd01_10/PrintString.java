package by.it.liukhtenko.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.String;

public class PrintString {
    public static void main(String[] args) {
       Class<String> stringClass = String.class;
       Method[] methods = stringClass.getDeclaredMethods();
       for (Method method : methods) {
           int modifiers = method.getModifiers();
           if(!(Modifier.isStatic(modifiers)))
           {
               System.out.println(method.getName());
           }
        }

        }
}





