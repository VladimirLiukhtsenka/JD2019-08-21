package by.it.agadzhanov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words = new String[0];
    private static int[] counts = new int[0];

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);

        // Пока matcher находит слова
        while (matcher.find()) {
            String word = matcher.group();
            int p = position(word);
            // если слово уже встречалось
            if (p >= 0) {
                counts[p]++;
            }

            // Если слово новое
            else {
                int last = words.length;
                words = Arrays.copyOf(words, last + 1);
                words[last] = word;
                counts = Arrays.copyOf(counts, last + 1);
                counts[last] = 1;
            }
        }

        // Печать слов в нужном формате со счетчиками
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "=" + counts[i]);
        }
    }

    /**
     * Функция, ищущая переданное её слово в массиве words
     * @param word Слово из текста
     * @return Возвращает индекс в массиве words, если слово уже встречалось, или -1, если слово не встречалось ранее
     */
    private static int position(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word))
                return i;
        }
        return -1;
    }
}