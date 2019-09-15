package by.it.daletski.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {

        Class<?> structure = Math.class;
        Method[] methods= structure.getMethods();
        for (Method method : methods) {
            StringBuilder line = new StringBuilder ();
            int modifiers = method.getModifiers ();
            if(Modifier.isPublic (modifiers))line.append ("public ");
            if(Modifier.isPublic (modifiers))line.append ("static ");
           // if(Modifier.isPublic (modifiers))line.append ("float");

            line.append (method.getName ()).append (" ");
            line.append (method.getName ()).append (')');

            Class<?>[] parameterTypes = method.getParameterTypes ();
                for (Class<?> parameterType : parameterTypes){

                }
            }

        }

    }

