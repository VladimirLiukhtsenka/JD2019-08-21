package by.it.akhmelev.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) {


        Class<?> structure = Math.class;


        Method[] methods = structure.getDeclaredMethods();
        for (Method method : methods) {

            StringBuilder line=new StringBuilder();
            int modifiers = method.getModifiers();

            if (Modifier.isPublic(modifiers)) line.append("public ");
            if (Modifier.isStatic(modifiers)) line.append("static ");
            //.....
            line.append(method.getReturnType().getSimpleName()).append(" ");
            line.append(method.getName()).append('(');

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                line.append(parameterType.getSimpleName()).append(',');
            }

            line.append(')');
            System.out.println(line);

        }
    }

}
