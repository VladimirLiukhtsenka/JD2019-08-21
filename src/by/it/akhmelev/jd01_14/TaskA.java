package by.it.akhmelev.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {

    private static String getPath(Class<TaskA> taskAClass) {
        String rootProject = System.getProperty("user.dir");
        String subPath = taskAClass.getName()
                .replace(".", File.separator)
                .replace(taskAClass.getSimpleName(), "");
        return rootProject + File.separator + "src" + File.separator + subPath;
    }

    public static void main(String[] args) {
        String path = getPath(TaskA.class);
        String filename = path + "dataTaskA.bin";
        writeBinary(filename);

        List<Integer> list = new ArrayList<>(20);
        readBinary(filename, list);

        printToConsole(list);

        String fileTxt = path + "resultTaskA.txt";
        printToFile(list, fileTxt);
    }

    private static void printToFile(List<Integer> list, String fileTxt) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(fileTxt));
            double sum2 = 0;
            for (Integer i : list) {
                out.printf("%d ", i);
                sum2 += i;
            }
            out.printf("\navg=%f\n", sum2 / list.size());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                out.close();
        }
    }

    private static void printToConsole(List<Integer> list) {
        double sum = 0;
        for (Integer i : list) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("\navg=%f\n", sum / list.size());
    }

    private static void readBinary(String filename, List<Integer> list) {
        try (
                DataInputStream dis = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(filename)
                        )
                )
        ) {
            while (dis.available() > 0) {
                int i = dis.readInt();
                list.add(i);
            }
        } catch (IOException e) {
            System.err.println("Error read " + filename);
        }
    }

    private static void writeBinary(String filename) {
        try (
                FileOutputStream fos = new FileOutputStream(filename);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos)
        ) {
            for (int i = 0; i < 20; i++) {
                int value = (int) (Math.random() * 100);
                dos.writeInt(value);
            }
        } catch (IOException e) {
            System.err.println("Error write " + filename);
        }
    }

}
