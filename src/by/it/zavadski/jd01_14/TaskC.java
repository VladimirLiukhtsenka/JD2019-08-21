package by.it.zavadski.jd01_14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskC {
    private static String getClassPath(Class <?> className){
        String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        String packagePath=className.getPackage().getName().replace(".",File.separator);
        return path+packagePath;
    }
    //Specify path and Name for file with results
    private static String outputFilePath=getClassPath(TaskC.class)+File.separator+"resultTaskC.txt";

    public static void main(String[] args) {
        try(PrintWriter printer=new PrintWriter(new FileWriter(outputFilePath)))
        {
            //Create new file with package path
            File file = new File(getClassPath(TaskC.class));
            //Get parent for specified path
            String fileParent = file.getParent();
            //Create a new file with parent path
            file=new File(fileParent);
            //Get list of files by parent path
            File[] folders= file.listFiles();
            for (File folder : folders) {
                //Get folder name
                String folderName=folder.getName();
                //Get list of folders
                String[] filesList=folder.list();
                //Print name of folder
                System.out.printf("dir:%s\n",folderName);
                printer.printf("dir:%s\n",folderName);
                for (String fileName : filesList) {
                    //Print name of files for current folder
                    System.out.printf("\tfile:%s\n",fileName);
                    printer.printf("\tfile:%s\n",fileName);
                }
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFilesNames(String surname) {

    }
}
