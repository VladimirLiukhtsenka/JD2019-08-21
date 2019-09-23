package by.it.yuntsevich.jd01_14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskC {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "by" + File.separator + "it" + File.separator + "yuntsevich"+ File.separator;
        String filetxt = getPath(TaskC.class) + "resultTaskC.txt";

        File directory = new File(path);
        try (PrintWriter out = new PrintWriter(new FileWriter(filetxt))) {
            printFilesAndDirectories(directory, out);
        } catch (IOException e) {
            System.err.println("Error write " + filetxt);
        }
    }

    private static void printFilesAndDirectories(File fileName, PrintWriter out){
        if (fileName.isDirectory()) {
            System.out.println("dir:" + fileName.getName());
            out.print("dir:" + fileName.getName()+"\n");
            File [] files = fileName.listFiles();
            for(File element: files) {
                if (element.isDirectory())
                    printFilesAndDirectories(element.getAbsoluteFile(), out);
                else {
                    System.out.println("file:" + element.getName());
                    out.print("file:" + element.getName()+"\n");
                }
            }
        }
        else {
            System.out.println("file:" + fileName.getName());
            out.print("file:" + fileName.getName()+"\n");
        }
    }

    private static String getPath (Class < TaskC > taskCClass) {
        String rootProject = System.getProperty("user.dir");

        String subPath = taskCClass.getName().replace(".", File.separator).replace(taskCClass.getSimpleName(), "");
        return rootProject + File.separator + "src" + File.separator + subPath;
    }

}
