package by.it.krautsevich.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.Math ;

public class PrintMath {
    public static void main(String[] args) {
        Class <?> mathClass = Math.class ;
        Method[] methods = mathClass.getDeclaredMethods() ;

        for (Method method : methods) {
            StringBuilder line = new StringBuilder() ;
            int modifiers = method.getModifiers();
           if (Modifier.isPublic(modifiers)) line.append("public ");
           if (Modifier.isStatic(modifiers)) line.append("static ");

            line.append(method.getReturnType().getSimpleName()).append(" ") ;
            line.append(method.getName()).append("(") ;
            Class <?> [] parameters = method.getParameterTypes() ;
            for (Class <?> parameter : parameters) {
                line.append(parameter.getSimpleName()).append(',') ;}
            line.append(')') ;
            if (line.charAt(line.length()-2)== ',')
            line.deleteCharAt(line.length()-2);
           if (Modifier.isPublic(modifiers))
            {System.out.println(line);}
            else {
                System.out.println();}



            }

        System.out.println("------Now we will print fields--------");

        Field[] fields = mathClass.getDeclaredFields();

        for (Field field1 : fields) {
            StringBuilder line = new StringBuilder() ;
            int modifiers = field1.getModifiers();
            if (Modifier.isPublic(modifiers)) line.append("public ");
            if (Modifier.isStatic(modifiers)) line.append("static ");
            line.append(field1.getType()).append(" ") ;

            line.append(field1.getName()).append(" ") ;


            if (Modifier.isPublic(modifiers))
            {System.out.println(line);}
            else {
                System.out.println();}
    }

}}








