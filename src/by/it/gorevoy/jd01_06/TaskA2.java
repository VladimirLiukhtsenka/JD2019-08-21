package by.it.gorevoy.jd01_06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    static String [] a ={};
    static int [] b = {};
    static int pos(String word){
        for (int i = 0; i <a.length ; i++) {
            if(a[i].equals(word)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        StringBuilder text1 = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()){
            String word=matcher.group();
            int p=pos(word);
            if (p>=0){
                b[p]++;
            }else  {
                int last = a.length;
                        a = Arrays.copyOf(a,last+1);
                a[last] = word;
                b =Arrays.copyOf(b,last+1);
                b[last]=1;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+"="+b[i]);

        }
    }


}
