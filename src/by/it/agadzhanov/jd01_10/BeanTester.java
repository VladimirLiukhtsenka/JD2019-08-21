package by.it.agadzhanov.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Class<?> beanClass = Bean.class;
        Method[] methods = beanClass.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                double result;
                Param paramAnnotation = method.getAnnotation(Param.class);
                if ((method.getModifiers() & Modifier.STATIC) == Modifier.STATIC) {
                    result = (double) method.invoke(null, paramAnnotation.a(), paramAnnotation.b());
                }
                else {
                    Object o = beanClass.newInstance();
                    result = (double) method.invoke(o,paramAnnotation.a(),paramAnnotation.b());
                }
                System.out.print("Метод " + method.getName() + " был успешно вызван и вернул " + result);
                System.out.println();
            }
        }
    }
}