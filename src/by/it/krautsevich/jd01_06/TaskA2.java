package by.it.krautsevich.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String [] words ={} ;
    private static int [] numbers = {} ;

    private static int poz (String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word))
                return i ;}
        return -1; }


    public static void main(String[] args) {

        TaskA() ; }

    private static void TaskA() {
        Pattern pattern1 = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern1.matcher(Poem.text) ;
        while (matcher.find()) {
            String word = matcher.group();
            int p = poz(word);
            if (p>=0) {numbers[p]++; }
            else {
                int last = words.length;
                words = Arrays.copyOf(words , last+1) ;
                words[last] =word ;
                numbers = Arrays.copyOf(numbers , last +1) ;
                numbers[last] = 1 ; }}

            for (int i = 0; i < words.length ; i++) {
                System.out.println(words[i] + "=" + numbers[i]); }
        }
    }

