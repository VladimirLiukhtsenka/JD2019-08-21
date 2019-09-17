package by.it.liukhtenko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BeanTester {
    public static void main(String[] args) throws Exception{
        Class<Bean> name = Bean.class;
        Method[] methods = name.getDeclaredMethods();
        Object o = null;

        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if(method.isAnnotationPresent(Param.class)){
                Param param = method.getAnnotation(Param.class);
                int a = param.a();
                int b = param.b();
                Double result = 0.0;
                if(Modifier.isStatic(modifiers)){
                    result = (Double) method.invoke(null,a,b);
                }
                else{
                    o = name.newInstance();
                    result =  (Double) method.invoke(o,a,b);
                }
                System.out.println(method.getName());
                System.out.println(result);
            }
        }
    }
}
