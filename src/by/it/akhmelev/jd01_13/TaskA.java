package by.it.akhmelev.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();

            StackTraceElement[] trace = e.getStackTrace();
            for (StackTraceElement element : trace) {
                String className = element.getClassName();
                if (className.contains("TaskA")) {
                    String name = e.getClass().getName();
                    int lineNumber = element.getLineNumber();
                    System.out.printf(" name: %s\n" +
                                    "class: %s\n" +
                                    " line: %d\n"
                            , name, className, lineNumber);
                }
            }

        }
    }
}
