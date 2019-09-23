package by.it.agadzhanov.jd01_14;

import java.io.*;

public class TaskC {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "by" + File.separator
                + "it" + File.separator + "agadzhanov" + File.separator;

        File myDirectory = new File(path);
        File[] filesAndDirectories = myDirectory.listFiles();

        try (PrintWriter writer = new PrintWriter(new FileWriter(TaskA.dir(TaskC.class) + "resultTaskC.txt"))) {
            if (filesAndDirectories != null) {
                for (File element : filesAndDirectories) {
                    //Если элемент является каталогом
                    if (element.isDirectory()) {
                        System.out.println("dir:" + element.getName());   //ТО напечатать его имя
                        writer.println("dir:" + element.getName());
                        File[] files = element.listFiles();

                        //И напечатать имена всех содержащихся в нем файлов
                        if (files != null) {
                            for (File file : files) {
                                System.out.println("file:" + file.getName());
                                writer.println("file:" + file.getName());
                            }
                        }
                        System.out.println();
                        writer.println();
                    }

                    //Если элемент является просто файлом, напечатать его имя
                    if (element.isFile()) {
                        System.out.println("file:" + element.getName());
                        writer.println("file:" + element.getName());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
