package by.it.krautsevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {

        TaskA1();
        }

    private static void TaskA1() {
        StringBuilder poem = new StringBuilder(Poem.text);
        Pattern pattern1 = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern1.matcher(Poem.text) ;
        while (matcher.find()) {
            int start = matcher.start();
            poem.setCharAt(start+3 , '#');
            if (matcher.group().length()>=7) {poem.setCharAt(start+6 , '#') ; }}
        System.out.println(poem);
    }
}
