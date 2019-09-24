package by.it.zavadski.jd01_15;
import by.it.zavadski.jd01_15.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TaskB {
    //1st one line comment for main method
    public static void main(String[] args) {
        String inputFile = TaskA.getClassPath(TaskB.class).concat("TaskB.java");
        String outputFile = TaskA.getClassPath(TaskB.class).concat("TaskB.txt");
        printer(removeComments(inputFile),outputFile);
    }
/*
2lined comment to be removed*/
    private static StringBuilder removeComments(String inputFile) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(inputFile))

                ){

        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
//printer method for print result
    private static void printer(StringBuilder stringBuilder, String outputFile) {
        try(PrintWriter writer=new PrintWriter(new FileWriter(outputFile))){
            writer.print(stringBuilder);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
/*
Multiple lined
comment
check
 */
    private static void readFile(String filename) {
        try {
            Files.lines(Paths.get(filename)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
