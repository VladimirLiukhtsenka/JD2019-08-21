package by.it.zavadski.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**TaskB2. Вывести через \n все предложения текста в порядке возрастания количества символов
 * (!) в каждом из них. В предложениях нужно сначала заменить все небуквенные символы и их последовательности
 * на один пробел и выполнить trim() для каждого предложения.**/

public class TaskB2 {
    public static void main(String[] args) {
        //StringBuilder textOrigin = new StringBuilder(Poem.text);
        Pattern symbols=Pattern.compile("[а-яёА-ЯЁ\\p{Blank}]+");
        String[] sentences = Poem.text.split("[.]+");
        String[] clearSentences=new String[sentences.length];

        for (int k = 0; k < sentences.length; k++) {
            clearSentences[k] = sentences[k].replaceAll("\\n"," ");
            clearSentences[k]=clearSentences[k].replaceAll("\\p{Punct}", " ").trim();
//            Matcher matcher = symbols.matcher(clearSentences[k]);
//            if (matcher.find()){
//                String counted=matcher.group();
//}
        }
        for (int i = 0; i <=clearSentences.length-2; i++) {
            for (int j = i+1; j<=clearSentences.length-1; j++) {
                if ((clearSentences[i].length()  > clearSentences[j].length())) {
                    String buffer=clearSentences[j];
                    clearSentences[j]=clearSentences[i];
                    clearSentences[i]=buffer;

                }

            }
            System.out.printf("%s\n",clearSentences[i]);
        }
//        for (int i = 0; i <clearSentences.length ; i++) {
//            System.out.printf("%s\n",clearSentences[i]);
//        }
    }
}

