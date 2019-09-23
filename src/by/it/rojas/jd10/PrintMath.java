package by.it.rojas.jd10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    /*public static void main(String[] args) {

        Class<Math> structMath = Math.class;
        Method[] methods = structMath.getDeclaredMethods();
        for (Method method : methods){
            if ((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC)
            System.out.println(method);
         }
    }*/

    public static void main(String[] args) {
        Class<Math> structMath = Math.class;
        Method[] methods = structMath.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder line = new StringBuilder();
            int modifiers = method.getModifiers();
            //if ((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC)
            if (Modifier.isPublic(modifiers)) line.append("public ");
            if (Modifier.isPublic(modifiers)) line.append("static ");
            line.append(method.getReturnType().getSimpleName()).append(" ");
            line.append(method.getName()).append('(');
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                line.append(parameterType.getSimpleName()).append(',');
            }
            if (parameterTypes.length >= 1) {
                line.setLength(line.length() - 1);
            }
            line.append(')');
            System.out.println(line);
        }
        Field[] fields = structMath.getDeclaredFields();
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

