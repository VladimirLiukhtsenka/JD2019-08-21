package by.it.daletski.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB1 {

    public static void main(String[] args) {
        Map<String, Integer> text = new HashMap<> ();
        Scanner sc = new Scanner (System.in);
        getWords (sc, text);
        print (text);

    }

    private static void getWords(Scanner sc, Map<String, Integer> text) {
        String inputWord;
        String[] words;
        int index = 0;
        while (!(inputWord = sc.next ()).equals ("end")) {
            words = inputWord.replace ("isn't", "don't").replaceAll ("[,.;:]", "").split (" ");
            wordsCount (words, text);

        }
    }

    private static void wordsCount(String[] words, Map<String, Integer> text) {
        for (String word : words) {
            if (text.containsKey (word)) {
                int count = text.get (word);
                text.replace (word, ++count);
            } else {
                text.put (word, 1);
            }
        }
    }

    public static void print(Map<String, Integer> text) {
        System.out.println (text);
    }

}
