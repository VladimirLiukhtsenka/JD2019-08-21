package by.it.krautsevich.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskA {

    private static String getPath(Class<TaskA> taskAClass) {
        String rootProject = System.getProperty("user.dir") ;
        String subPaths = taskAClass.getName().replace("." , File.separator).
                replace(taskAClass.getSimpleName() , "") ;
        String path = rootProject + File.separator+ "src" + File.separator + subPaths ;
        return path ;
    }

    private static void readBinaryAndPrintInConsole(String filename, List<Integer> list) {
        try (
                DataInputStream dis = new DataInputStream(new BufferedInputStream( new FileInputStream(filename)))
        ) {
            while (dis.available() > 0) {
                int i = dis.readInt() ;
                list.add(i) ;
            }
            double sum = 0;
            for (int element : list) {
                System.out.print(element + " ");
                sum = sum +  element ;
            }
            double average = sum/list.size() ;
            System.out.println();
            System.out.print("avg=" + average);
        }
        catch (IOException e) {
            System.err.println(filename + " не удается прочитать");}
    }

    private static void writeRandomBinaryToFile(String filename) {
        try (
                FileOutputStream fos = new FileOutputStream(filename);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);
        ) {
            for (int i = 0; i < 20; i++) {
                int value = (int) (Math.random()*100 );
                dos.writeInt(value);
            }
        }
        catch (IOException e) {
            System.err.println(filename + " не удается записать");
        }
    }

    private static void printToFileTheSameAsToConsole(String filename, String fileTXT, List<Integer> list) {
        PrintWriter writer = null ;
        try {writer = new PrintWriter(new FileWriter(fileTXT));
            double sum2 = 0;
            for (int element : list) {
                writer.printf("%d ", element);
                sum2 = sum2 +  element ;
            }
            double average = sum2/list.size() ;
            writer.println();
            writer.print("avg=" + average);
        }
        catch (IOException e) {
            System.err.println(filename + " не удается записать ArrayList");
        }
        finally {if (writer != null)
            writer.close();}
    }

    public static void main(String[] args) {
        String path = getPath(TaskA.class);
        String filename = path + "dataTaskA.bin" ;
        String fileTXT = path + "resultTaskA.txt" ;
        List<Integer> list = new ArrayList<>(20) ;

        writeRandomBinaryToFile(filename);

        readBinaryAndPrintInConsole(filename, list);

        printToFileTheSameAsToConsole(filename, fileTXT, list);
    }
}
