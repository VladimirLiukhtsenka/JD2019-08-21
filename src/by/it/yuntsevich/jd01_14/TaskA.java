package by.it.yuntsevich.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {
    public static void main(String[] args) {
        String path = getPath(TaskA.class);
        System.out.println(path);

        String fileName = path + "dataTaskA.bin";
        writeBinary(fileName);

        List<Integer> list = new ArrayList<>(20);
        readBinary(fileName, list);

        printToConsole(list);

        String filetxt = path + "resultTaskA.txt";
        printToFile(filetxt, list);
    }

    private static void printToFile(String filetxt, List<Integer> list) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(filetxt));
            double sum2 = 0;
            for (int a : list) {
                sum2 += a;
                out.print(a + " ");
            }
            out.println("\navg=" + sum2 / list.size());

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }

        }
    }

    private static void printToConsole(List<Integer> list) {
        double sum = 0;
        for (int a : list) {
            sum += a;
            System.out.print(a + " ");
        }
        System.out.println("\navg=" + sum / list.size());
    }

    private static List<Integer> readBinary(String fileName, List<Integer> list) {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))
        ) {
            while (dis.available() > 0) {
                int i = dis.readInt();
                list.add(i);
            }

        } catch (IOException e) {
            System.err.println("Error read " + fileName);
        }
        return list;
    }

    private static void writeBinary(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 100));
            }

        } catch (IOException e) {
            System.err.println("Error write " + fileName);
        }
    }

    private static String getPath(Class<TaskA> taskAClass) {
        String rootProject = System.getProperty("user.dir");

        String subPath = taskAClass.getName().replace(".", File.separator).replace(taskAClass.getSimpleName(), "");
        return rootProject + File.separator + "src" + File.separator + subPath;
    }
}
