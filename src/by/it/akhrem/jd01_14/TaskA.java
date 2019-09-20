package by.it.akhrem.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {
    public static void main(String[] args) {
        /*Class<TaskA> taskAClass = TaskA.class;
        String path = getPath(taskAClass);
        String filename = path + "dataTaskA.bin";
        //write Binary
        try(
        FileOutputStream fos = new FileOutputStream(filename);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        ) {
            for (int i = 0; i < 20; i++){
                int value = (int)(Math.random()*100);
                dos.writeInt(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // read Binary
        List<Integer> list = new ArrayList<>(20);
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));) {
            while (dis.available() > 0) {
                int i = dis.readInt();
                list.add(i);

            }
        } catch (IOException e) {
            System.err.println("Error read " + filename);
        }
        double sum = 0;
        for (Integer i : list) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("\navg=%f\n", sum/list.size());

        String fileTxt = path + "resultTaskA.txt";
        try {
            PrintWriter out = new PrintWriter(new FileWriter(fileTxt));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        double sum = 0;
        for (Integer i : list) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("\navg=%f\n", sum/list.size()); */
    }

    private static String getPath(Class<TaskA> taskAClass) {
        String rootProject = System.getProperty("user.dir");
        String subPath = taskAClass.getName().replace(".", File.separator).replace(taskAClass.getSimpleName(), "");
        String path = rootProject + File.separator + "src" + File.separator + subPath;
        return path;
    }
}
