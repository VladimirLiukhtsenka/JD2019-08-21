package by.it.zlotnikova.jd01_12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<>();
        String newWord;
        while(!(newWord = scanner.next()).equals("end")) {
            newWord = newWord.replaceAll("[^A-Za-z']", "");
            if (words.containsKey(newWord)) {
                words.replace(newWord, words.get(newWord) + 1);
            } else words.put(newWord, 1);
        }
        System.out.println(words);
    }
}

