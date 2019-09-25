package by.it.zavadski.jd01_15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс TaskC Нужно реализовать на java приложение - аналог командной строки Windows. Приложение должно
 * использовать класс File и поддерживать две команды консоли:
 *  команду cd - смена каталога
 *  команду dir - вывод каталога, формат вывода - аналогичный формату в Windows.
 *  команда end – завершение работы.
 *  Стартовым каталогом при запуске приложения должна быть папка by.it.ваша_фамилия.jd01_15.
 */

public class TaskC {
    private static StringBuilder defaulttDir=new StringBuilder(getClassPath(TaskC.class));

    private static String getClassPath(Class <?> className){
        String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String packagePath=className.getPackage().getName().replace(".",File.separator);
        return path+packagePath;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputKey;
        while(!(inputKey=scanner.nextLine()).equals("end")){
            StringBuilder cmd=new StringBuilder(inputKey);
            changeDirectory(cmd);
        }
    }

    private static void changeDirectory(StringBuilder input) {
        String[] cmds=input.toString().split(" ", 2);
        if (input.toString().equals("cd..")||input.toString().equals("cd ..")){
            defaulttDir.delete(defaulttDir.lastIndexOf(File.separator),defaulttDir.length());
            System.out.println(defaulttDir);

        }
        if(input.toString().equals("cd")||input.toString().equals("cd ")){
            File file=new File(defaulttDir.toString());
            input.delete(0,3);
            for (File listFile : file.listFiles()) {
                if (input.toString().equals(listFile.getName())){
                    defaulttDir.append(File.separator).append(listFile.getName());
                }
            }
            System.out.println(defaulttDir.toString());
        }
        if (cmds[1]!=null){
            File file= new File(new File(defaulttDir.toString()).getAbsolutePath()+File.separator+cmds[1]);
            System.out.println(file.getAbsolutePath());
        }

        if(input.toString().equals("dir")){
            try{
                File file2=new File(defaulttDir.toString());
                System.out.println("dir: "+file2.getName());
                for (File listFile : file2.listFiles()) {
                    System.out.println("\tfile: "+listFile.getName());
                }
            }
            catch (NullPointerException e){
                System.out.println("Empty folder");
            }
        }
    }
}
