package by.it.zlotnikova.jd01_06;

import java.util.Arrays;

public class TaskB2 {
    public static void main(String[] args) {
        String poem = Poem.text;
        poem = poem.replaceAll("\\.\\.\\.", ""); //suits for this particular case only
        String[] sentences = poem.split("\\.|\\?|!");

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].replaceAll("[^а-яА-ЯёЁ]+", " ");
            sentences[i] = sentences[i].trim();
        }

//        int comp = Comparator.comparing(sentences[0], sentences[1])
//        System.out.println(comp);
        Arrays.sort(sentences);

        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
