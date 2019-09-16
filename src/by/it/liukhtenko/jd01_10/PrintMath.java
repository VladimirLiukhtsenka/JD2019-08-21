package by.it.liukhtenko.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {

        Class<Math> Structmath = Math.class;
        Method[] methods = Structmath.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder line = new StringBuilder();
            int modifiers = method.getModifiers();
                if (Modifier.isPublic(modifiers)) {
                    if (Modifier.isPublic(modifiers)) line.append("public ");
                    if ((method.getModifiers() & Modifier.STATIC) == Modifier.STATIC) line.append("static ");
                  //  if ((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) line.append("public ");
                    line.append(method.getReturnType().getSimpleName()).append(" ");
                    line.append(method.getName()).append('(');
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    for (Class<?> parameterType : parameterTypes) {
                        line.append(parameterType.getSimpleName()).append(',');

                    }
                    line.append(')');
                    String f = new String(line);
                    String f1 = f.replace(",)", ")");
                    System.out.println(f1);

                }
        }
        Field[] fields = Structmath.getFields();
        for (Field field : fields) {
            System.out.print(field.getGenericType() +" ");
            System.out.println(field.getName());
        }

        // System.out.println("double E");
      // System.out.println("double PI");
    }
}
