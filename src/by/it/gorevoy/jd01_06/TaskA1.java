package by.it.gorevoy.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        Poem textOld = new Poem();
        StringBuilder textNew = new StringBuilder(textOld.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(textNew);
        while (matcher.find()){
            int start = matcher.start();
            textNew.setCharAt(start+3,'#');
            if (matcher.group().length()>=7){
                textNew.setCharAt(start+6,'#');
            }

        }

        System.out.println(textNew);




    }

    static void split (){


    }
}
