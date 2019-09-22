package by.it.yuntsevich.jd01_14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    public static void main(String[] args) {
        String path = getPath(TaskB.class);
        String fileName = path + "text.txt";
        File f = new File(fileName);

        StringBuilder s = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = reader.readLine();
            while (line != null) {
                s.append(line);
                s.append(System.lineSeparator());
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // считаем слова в строке
        Pattern words = Pattern.compile("[а-яёА-ЯЁ]+");
        int wordsCounter = 0;
        Matcher matcherWords = words.matcher(s);
        while (matcherWords.find()) {
            wordsCounter++;
        }

        //считаем знаки препинания

        Pattern punctuationMarks = Pattern.compile("[!.,;:?\\-]");
        int punctuationMarksCounter = -2;
        Matcher matcherpunctuationMarks = punctuationMarks.matcher(s);
        while (matcherpunctuationMarks.find()) {
            punctuationMarksCounter++;
        }

        System.out.println("words=" + wordsCounter + ", punctuation marks=" + punctuationMarksCounter);

        //
        String filetxt = path + "resultTaskB.txt";
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(filetxt));
            out.println("words=" + wordsCounter + ", punctuation marks=" + punctuationMarksCounter);

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }

        }
    }

        private static String getPath (Class < TaskB > taskBClass) {
            String rootProject = System.getProperty("user.dir");

            String subPath = taskBClass.getName().replace(".", File.separator).replace(taskBClass.getSimpleName(), "");
            return rootProject + File.separator + "src" + File.separator + subPath;
        }

}
