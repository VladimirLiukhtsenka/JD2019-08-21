package by.it.akhrem.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Class<Bean> clBean = Bean.class;
        Object bean = clBean.newInstance();
        try {
            Method [] methods = clBean.getDeclaredMethods();
            for(Method m: methods) {
                if (m.isAnnotationPresent(Param.class)) {
                    Param param = m.getAnnotation(Param.class);
                    int modifiers = m.getModifiers();
                    double result;
                    if (Modifier.isStatic(modifiers))
                        result = (double)m.invoke(null, param.a(), param.b());
                    else result = (double)m.invoke(bean, param.a(), param.b());
                    System.out.println(m.getName()+ " " + result);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
