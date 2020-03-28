package by.it.liukhtenko.training;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String s = "я бы прогулялся, но я прогуляюсь попозже бы";
        String [] mas = s.split(" ");
        Map<String, Integer> stringMap = new HashMap<>();
        for (String ma : mas) {
            if(stringMap.containsKey(ma)){
                stringMap.put(ma,stringMap.get(ma)+1);
            }else stringMap.put(ma,1);
        }
        System.out.println(stringMap);
    }
}
