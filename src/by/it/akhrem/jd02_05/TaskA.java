package by.it.akhrem.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public class TaskA {
    public static void main(String[] args) {
        Locale locale = new Locale("ru", "RU");

        String welcom = resourceBundle.getString("message.welcom");
        System.out.println(welcom);

    }
}
