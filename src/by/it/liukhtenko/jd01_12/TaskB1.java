package by.it.liukhtenko.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Map<String, Integer> words= new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        String s ;
        while (!(s = sc.next()).equals("end")){
             s= s.replaceAll("[^a-zA-Z' +]","");
            String[] a = s.split("^a-zA-Z'+");
            for (String str : a) {
                if(words.containsKey(str)){
                    words.put(str, words.get(str)+1);
                }
                else {
                    words.put(str,1);
                }
            }
            }
        System.out.println(words);


       /* Map<String, Integer> counts= new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);
        String Str ;
        while (!(Str = s.next()).equals("end")){
                String word = s.next();
                if( !counts.containsKey( word ) )
                    counts.put( word, 1 );
                else
                    counts.put( word, counts.get(word) + 1 );

        }
        System.out.println(counts);

       */
        }

    }

