package by.it.yuntsevich.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;


public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Method[] methods = mathClass.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder line = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) line.append("public ");
            else continue;
            if (Modifier.isStatic(modifiers)) line.append("static ");
            line.append(method.getReturnType().getSimpleName()).append(" ");

            line.append(method.getName()).append('(');
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                line.append(parameterType.getSimpleName()).append(",");

            }
            if (line.charAt(line.length() - 1) == ',')
                line.deleteCharAt(line.length() - 1);
            line.append(')');
            System.out.println(line);

        }
        Field[] fields = mathClass.getDeclaredFields();
        for (Field field : fields) {
            StringBuilder line = new StringBuilder();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                line.append(field.getType().getSimpleName()).append(" ");

                line.append(field.getName());
                System.out.println(line);
            }

        }
    }


}

