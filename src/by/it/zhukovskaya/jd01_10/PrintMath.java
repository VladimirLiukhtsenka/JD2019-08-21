package by.it.zhukovskaya.jd01_10;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Class<String> stringClass = String.class;
        Method[] methods = mathClass.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            Modifier.isPublic(modifiers);
            if (Modifier.isPublic(modifiers)){
                System.out.println(method);
            }

        }
    }
}
