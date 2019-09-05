package by.it.gorevoy.jd01_06;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[б, в, г, д, ж, з, й, к, л, м, н, п, р, с, т, ф, х, ц, ч, ш, щ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()){
            int start = matcher.start();
            System.out.println(Poem.text);
        }
    }
}
