package by.it.agadzhanov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC2 {
    private static int[] indices = new int[0];

    public static void main(String[] args) {
        double slowTimeStart = System.currentTimeMillis();
        String testStringSlow = slow(Poem.text);
        double slowTime = System.currentTimeMillis() - slowTimeStart;

        System.out.println(testStringSlow);
        System.out.println(slowTime);

        double fastTimeStart = System.currentTimeMillis();
        String testStringFast = fast(Poem.text);
        double fastTime = System.currentTimeMillis() - fastTimeStart;

        System.out.println(testStringFast);
        System.out.println(fastTime);
    }

    /**
     * Метод, создающий длинную строку из слов из текста через пробел минимум из 100000 медленным способом (String)
     * @param text Исходный текст, из которого будут браться слова
     * @return Возвращает длинную строку
     */
    private static String slow(String text) {
        Pattern wordsPattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher wordsMatcher = wordsPattern.matcher(text);
        String[] words = new String[0];

        // Создать массив из уникальных слов
        while (wordsMatcher.find()) {
            String word = wordsMatcher.group();
            boolean wordFlag = false;

            // Определить, встречалось слово или нет (true - встречалось, false - не встречалось)
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word)) {
                    wordFlag = true;
                    break;
                }
            }

            // Если встречалось, ничего не делать, если нет - добавить в конец массива
            if (wordFlag) {
                break;
            }
            else {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = word;
            }
        }

        // Создать длинную строку из случайных слов массива, сохраняя последовательность слов для метода fast
        String veryLongString = "";
        while (veryLongString.length() < 100000) {
            int index = (int) (Math.random() * words.length);
            indices = Arrays.copyOf(indices, indices.length + 1);
            indices[indices.length - 1] = index;
            veryLongString = veryLongString.concat(words[index]).concat(" ");
        }
        return veryLongString;
    }

    private static String fast(String text) {
        Pattern wordsPattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher wordsMatcher = wordsPattern.matcher(text);
        String[] words = new String[0];

        // Создать массив из уникальных слов
        while (wordsMatcher.find()) {
            String word = wordsMatcher.group();
            boolean wordFlag = false;

            // Определить, встречалось слово или нет (true - встречалось, false - не встречалось)
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word)) {
                    wordFlag = true;
                    break;
                }
            }

            // Если встречалось, ничего не делать, если нет - добавить в конец массива
            if (wordFlag) {
                break;
            } else {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = word;
            }
        }

        // Создать длинную строку из случайных слов массива
        StringBuilder veryLongStringBuilder = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            veryLongStringBuilder.append(words[indices[i]]).append(" ");
        }
        return  veryLongStringBuilder.toString();
    }
}