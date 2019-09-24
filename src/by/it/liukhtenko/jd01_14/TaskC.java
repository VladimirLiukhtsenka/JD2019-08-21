package by.it.liukhtenko.jd01_14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskC {

    private static String dir2(Class<?> cl) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = cl.getName().replace(cl.getSimpleName(), "").
                replace(".", File.separator);
      //  String s = path + clDir;
     //   s= s.substring(0, s.length()-1);
     //   System.out.println(s.lastIndexOf("\\",s.length()));
      //  s = s.substring(0,s.lastIndexOf("\\",s.length())+1);
      //  System.out.println(s);
        return path + clDir;

    }
    private static String dir(Class<?> cl) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String clDir = cl.getName().replace(cl.getSimpleName(), "").
                replace(".", File.separator).replace(cl.getCanonicalName(), "").
                replace(cl.getCanonicalName(), "");

        return path; //+ clDir;
    }
    public static void main(String[] args) {
       // System.out.println(dir2(TaskC.class));

        // System.out.println(dir(TaskC.class)+"by\\it\\liukhtenko\\");
        File folder = new File(dir(TaskA.class) + "by\\it\\liukhtenko\\");
        File[] listOfFiles = folder.listFiles();

            try (PrintWriter out2 = new PrintWriter(new FileWriter(dir2(TaskC.class) + "resultTaskC.txt"))) {
                for (int i = 0; i < listOfFiles.length; i++) {
                    File folder1 = new File(dir(TaskA.class) + "by\\it\\liukhtenko\\" +listOfFiles[i].getName());
                    File[] listOfFiles1 = folder1.listFiles();
                    for (int j=0;j<listOfFiles1.length;j++){
                        if (listOfFiles1[j].isFile()) {
                            System.out.println("file:" + listOfFiles1[j].getName());
                            out2.print("file:" + listOfFiles1[j].getName());
                        } else if (listOfFiles1[j].isDirectory()) {
                            System.out.println("dir:" + listOfFiles1[j].getName());
                            out2.print("dir:" + listOfFiles1[j].getName());
                        }
                    }
                    if (listOfFiles[i].isFile()) {
                        System.out.println("file:" + listOfFiles[i].getName());
                        out2.print("file:" + listOfFiles[i].getName());
                    } else if (listOfFiles[i].isDirectory()) {
                        System.out.println("dir:" + listOfFiles[i].getName());
                        out2.print("dir:" + listOfFiles[i].getName());
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}