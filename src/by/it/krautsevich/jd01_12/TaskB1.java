package by.it.krautsevich.jd01_12;

import java.util.HashMap;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        HashMap <String , Integer > words = new HashMap<>() ;

        for ( ;; )
        {
        String line = sc.next() ;
        if (!line.equals("end"))
        {String newLine = line.replaceAll("[\\. \\, \\! \\; \\: \\? \\( \\)]" , "");
        if (!words.containsKey(newLine)) {words.put(newLine, 1);}
        else if (words.containsKey(newLine)) {
            Integer newFr =  words.get(newLine)+1;
            words.put(newLine , newFr) ; }}
        else if (line.equals("end")) {
            for (String key: words.keySet())
                System.out.println(key +"=" + words.get(key));
        break ;}
        }
    }
}
