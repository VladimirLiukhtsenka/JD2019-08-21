package by.it.rojas.jd10;

/*
import org.w3c.dom.NameList;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;*/

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {

  /*  private static Object NameList;

    public static void main(String[] args) {

        Class<String> allstring = String.class;
        String allsimpleName = allstring.getSimpleName();
        for (Method method : allsimpleName){
            if ((method.getName(); NameList
                System.out.println(method);
        }
    }*/

    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)) {

                System.out.println(method.getName());

            }
        }
    }
}
