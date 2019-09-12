package by.it.yuntsevich.jd01_10;

import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Class<Bean> classBean = Bean.class;
        Bean bean;
        bean = classBean.newInstance();
        Method[] methods = classBean.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                Param param = method.getAnnotation(Param.class);
                System.out.print(method.getName() + " "+method.invoke((bean),param.a(), param.b()));
                System.out.println();
            }

        }
    }
}

