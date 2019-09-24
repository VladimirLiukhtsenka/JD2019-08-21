package by.it.zlotnikova.jd01_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TaskC {

    private static String getPath(Class<?> clazz) {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String subPath = clazz.getName().replace(clazz.getSimpleName(), "")
                .replace(".", File.separator);
        return path + subPath;
    }

    public static void main(String[] args) {
        String startPath = getPath(TaskC.class);
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        Path currentPath = Paths.get(startPath);
        switch (command) {
            case "end": break;
            case "dir": {executeDir(currentPath);
            }
            case "cd..": break;  // create logic
            case "cd" + "dirName": break; // create logic
        }
    }

    private static void executeDir(Path currentPath) {
        try {
            for (Path path : Files.newDirectoryStream(currentPath)) {
                String marker = "";
                if (Files.isDirectory(path)) {
                    marker = "DIR";
                }
                String size = "";
                if (!Files.isDirectory(path)) {
                    size = String.valueOf(Files.size(path));
                }
                System.out.println(Files.getLastModifiedTime(path) + " " + marker + " " + size
                        + " " + path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
