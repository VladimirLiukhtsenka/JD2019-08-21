package by.it.zavadski.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TaskB1. Вывести в консоль все слова текста, начинающихся согласной и заканчивающихся
 * гласной буквой (нужно сделать для проверки этого условия приватный метод без regex).
 */
public class TaskB1 {
    private static char[] vowels={'a','я','у','ю','э','е','ы','и','о','ё'};
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-яЁ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String word=matcher.group();
            process(word);
        }
    }
    private static void process(String word) {
        for (char vowel : vowels) {
            if (word.toLowerCase().charAt(0) != vowel && word.toLowerCase().charAt(word.length() - 1) == vowel) {
                System.out.printf("%s\n", word);
            }
        }
    }
}
