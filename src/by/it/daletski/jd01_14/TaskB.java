package by.it.daletski.jd01_14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    public static void main(String[] args) {
        String filename = dir(TaskB.class) + "text.txt";
        String line;
        int wordCountt = 0;
        int punctCount = 0;
        String fileTxt = dir(TaskB.class) + "resultTaskB.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename));
             PrintWriter out2 = new PrintWriter(new FileWriter(fileTxt))) {
            Pattern ptWords = Pattern.compile("[а-яА-ЯёЁ]+");
            Pattern ptPunctuation = Pattern.compile("[-,.!:]+");
            while ((line = br.readLine()) != null) {
                Matcher mtWords = ptWords.matcher(line);
                while (mtWords.find())
                    wordCountt++;
                Matcher mtPunctuation = ptPunctuation.matcher(line);
                while (mtPunctuation.find())
                    punctCount++;
            }
            System.out.printf("words=%d , punctuation marks=%d", wordCountt, punctCount);
            out2.print("words="+wordCountt+ " , punctuation marks="+punctCount);
        } catch (IOException e) {
            System.err.println("Error read " + filename);
        }
    }

    private static String dir(Class<?> cl) {
        String path = System.getProperty ("user.dir") + File.separator + "src" + File.separator;
        String clDir = cl.getName ().replace (cl.getSimpleName (), "").replace (".", File.separator);
        return path + clDir;
    }
}