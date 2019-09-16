package by.it.akhrem.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Method[] methods = mathClass.getMethods();
        for (Method method : methods) {
            StringBuilder line = new StringBuilder();
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) line.append("public ");
            if (Modifier.isStatic(modifiers)) line.append("static ");
            line.append(method.getReturnType()).append(" ");
            line.append(method.getName()).append('(');
            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean firstParam = true;
            for (Class<?> parameterType : parameterTypes) {
                if (firstParam) {
                    line.append(parameterType.getSimpleName());
                    firstParam = false;
                } else line.append(",").append(parameterType.getSimpleName());
            }
            line.append(')');
            System.out.println(line);
        }
        Field[] fields = mathClass.getFields();
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (!Modifier.isPrivate(modifiers) && !Modifier.isProtected(modifiers)) {
                StringBuilder lineFld = new StringBuilder();
                if (Modifier.isPublic(modifiers)) lineFld.append("public ");
                lineFld.append(field.getType()).append(" ").append(field.getName());
                System.out.println(lineFld);
            }
        }

    }
}
