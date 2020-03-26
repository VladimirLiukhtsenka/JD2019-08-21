package by.it.liukhtenko.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

enum RecourseManager {
    INSTANCE;
  private String baseName ;
  private ResourceBundle resourceBundle;
  private Locale locale;

    RecourseManager() {
        baseName = "by.it.liukhtenko.jd02_05.res.strings";
        setLocale(Locale.getDefault());
    }

    void setLocale(Locale locale){
        this.locale = locale;
        resourceBundle = ResourceBundle.getBundle(baseName,locale);
    }

     String get(String key) {
         return resourceBundle.getString(key);
     }
 }
