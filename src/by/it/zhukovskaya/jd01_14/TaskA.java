package by.it.zhukovskaya.jd01_14;

import java.io.File;

public class TaskA {
    public static void main(String[] args) {
        String rootProject = System.getProperty("user.dir");
        System.out.println(rootProject);
        Class<TaskA> taskAClass = TaskA.class;
        String subPath = taskAClass.getName().replace(".", File.separator).replace(taskAClass.getSimpleName(),"");
        String path=rootProject+File.separator+"src"+File.separator+subPath;
        System.out.println(path);
    }
}
