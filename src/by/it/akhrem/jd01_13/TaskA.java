package by.it.akhrem.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("Привет");
        }
        catch (NullPointerException | NumberFormatException e) {
            Class<? extends RuntimeException> clazz = e.getClass();
            String name = clazz.getName();
            StackTraceElement[] trace = e.getStackTrace();
            for (StackTraceElement element : trace) {
                String className = element.getClassName();
                if (className.contains("TaskA")) {
                    int lineNumber = element.getLineNumber();
                    System.out.printf(" name: %s\n " +
                                      " class: %s\n" +
                                      " line: %s\n", name, className, lineNumber);

                }
                System.out.println(element);
            }
        }
    }
}
