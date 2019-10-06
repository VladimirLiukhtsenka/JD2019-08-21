package by.it.zhukovskaya.jd02_05;

import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    String baseName="by.it.zhukovskaya.jd02_05.res.strings";
    ResourceBundle resourceBundle= ResourceBundle.getBundle(baseName,locale);


    public void get(String s){

    }
}
