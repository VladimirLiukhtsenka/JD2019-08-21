package by.it.agadzhanov.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        String[] methodNames = new String[0];

        for (Method method : methods) {
            if ((method.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                String methodName = method.getName();
                boolean isPresent = false;

                for (int i = 0; i < methodNames.length; i++) {
                    if (methodName.equals(methodNames[i])) {
                        isPresent = true;
                        break;
                    }
                }

                if (!isPresent) {
                    methodNames = Arrays.copyOf(methodNames, methodNames.length + 1);
                    methodNames[methodNames.length - 1] = methodName;
                }
            }
        }

        for (String methodName : methodNames) {
            System.out.println(methodName);
        }
    }
}
