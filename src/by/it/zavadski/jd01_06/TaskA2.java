package by.it.zavadski.jd01_06;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    /**
     * Определить, сколько раз повторяется в тексте каждое слово, которое встречается в
     * нем, используя массивы. Вывести результаты на консоль в формате слово=повторы
     **/
    static int[] wordsCount=new int[0];
    static String[] words=new String[0];

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-яЁ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String word=matcher.group();
            process(word);
        }
    printResult();
    }
    private static void process(String word) {
        for (int i = 0; i < words.length; i++) {
            if(word.equals(words[i])){
                wordsCount[i]++;
                return;
            }

        }
        words= Arrays.copyOf(words,words.length+1);
        wordsCount= Arrays.copyOf(wordsCount,wordsCount.length+1);
        words[words.length-1]=word;
        wordsCount[wordsCount.length-1]=1;
    }
    private static void printResult(){
        for (int i = 0; i <words.length ; i++) {
            System.out.printf("%s=%d\n",words[i],wordsCount[i]);
        }
}

}
