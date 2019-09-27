package by.it.shamuradova.jd01_15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TaskB {
    public static void main(String[] args) {

        String rootProject = System.getProperty("user.dir");

        /*/
        multi
        line
        comment
         */

        String classPath = TestClass.class.getName().replace('.', File.separatorChar); //.replaceAll(".", File.separator);
        Path path = Paths.get(rootProject + File.separator + "src" + File.separator + classPath + ".java");
        Class<TaskB> taskBClass = TaskB.class;
        String path1 = getPath(taskBClass);
        String filename = path1 + ".txt";

        // коммент
        try (PrintWriter pr = new PrintWriter(new FileWriter(filename))) {
            List<String> lines = Files.lines(path).collect(Collectors.toList());
            String codeWithoutSingleLineComments = lines
                    .stream()
                    .map(TaskB::removeSingleLineComments)
                    .collect(Collectors.joining("\n"));

            System.out.println(removeMultilineComments(codeWithoutSingleLineComments));
            pr.println(removeMultilineComments(codeWithoutSingleLineComments));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    private static String getPath(Class<TaskB> taskBClass) {
        String rootProject = System.getProperty("user.dir"); //C:\Users\Бегенч\IdeaProjects\JD2019-08-21
        String subPath = taskBClass.getName().replace(".", File.separator);//by\it\shamuradova\jd01_14\
        String path = rootProject + File.separator + "src" + File.separator + subPath; //C:\Users\Бегенч\IdeaProjects\JD2019-08-21\src\by\it\shamuradova\jd01_14\
        return path;
    }

    private static String removeSingleLineComments(String line) {
        char[] charArray = line.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length - 1 && charArray[i] == '/' && charArray[i + 1] == '/') {
                return line.substring(0, i);
            }
        }
        return line;
    }

    private static String removeMultilineComments(String text) {
        boolean commentOpen = false;
        char[] textChars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < textChars.length; i++) {
            if (commentOpen && textChars[i] == '*' && textChars[i + 1] == '/') {
                commentOpen = false;
                i++;
            } else if (i < textChars.length - 1 && textChars[i] == '/' && textChars[i + 1] == '*') {
                commentOpen = true;
                i++;
            } else if (!commentOpen) {
                builder.append(textChars[i]);
            }
        }
        return builder.toString();
    }
}
