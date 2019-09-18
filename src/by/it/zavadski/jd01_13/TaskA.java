package by.it.zavadski.jd01_13;

import java.util.HashMap;

public class TaskA{
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        }
        catch (NumberFormatException|NullPointerException e){

            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                if (className.contains("TaskA")) {
                    String simpleName = stackTraceElement.getClassName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    System.out.printf(" name:%s\n class:%\n line:%d\n",className,simpleName,lineNumber);
                }
                //System.out.println(stackTraceElement);
            }
        }
    }
}
