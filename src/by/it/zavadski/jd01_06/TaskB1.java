package by.it.zavadski.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TaskB1. Вывести в консоль все слова текста, начинающихся согласной и заканчивающихся
 * гласной буквой (нужно сделать для проверки этого условия приватный метод без regex).
 */
public class TaskB1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-яЁ]{2,}");
        String consonant="ЙйЦцКкНнГгШшЩщЗзХхФфВвПпРрЛлДдЖжЧчСсМмТтБб";
        String vowels="АаЯяУуЮюИиЁёОоЭэЕеЫы";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String word=matcher.group();
            process(word);
        }
    }

    private static void process(String word) {

    }
}
