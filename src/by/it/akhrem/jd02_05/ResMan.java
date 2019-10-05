package by.it.akhrem.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

enum ResMan {
    INSTANCE;

    private String res;
    private ResourceBundle resourceBundle;

    ResMan() {
        res="by.it.akhrem.jd02_05.res.strings";
        Locale locale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(res, locale);

    }

    public void get(String s) {

    }
}
