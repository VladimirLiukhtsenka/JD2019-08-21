package by.it.zavadski.jd01_10;



import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> mathClass = Math.class;
        Method[] methods = mathClass.getDeclaredMethods();
        for (Method method : methods) {
          if ((method.getModifiers() & Modifier.STATIC)==Modifier.STATIC){ //Ensure that modifier for method is static
              if ((method.getModifiers()& Modifier.PUBLIC)==Modifier.PUBLIC) { //Ensure that modifier for method is public
                    System.out.println(String.valueOf(method).replace("java.lang.Math.",""));
                }
            }
        }
        Field[] fields=mathClass.getFields();
        for(Field field:fields){
            System.out.println(String.valueOf(field).replace("java.lang.Math.",""));
        }
    }
}
