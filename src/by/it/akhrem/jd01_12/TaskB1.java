package by.it.akhrem.jd01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Map<String, Integer> wList = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String strValue = sc.next();
            //strValue = strValue.replace("[;:)]", "");
            strValue = reformatStr(strValue);
            if (strValue.equals("end")) break;
            if (wList.containsKey(strValue)) {
                Integer value = wList.get(strValue);
                value++;
                wList.put(strValue, value);
            } else wList.putIfAbsent(strValue, 1);
        }
        Set<String> keys = wList.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.printf("%s=%d\n", key, wList.get(key));
        }

    }

    static String reformatStr(String str) {
        Pattern regexp  = Pattern.compile("[a-zA-Z']+");
        Matcher matcher = regexp.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        } else return "";
    }
}
