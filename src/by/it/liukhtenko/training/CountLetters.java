package by.it.liukhtenko.training;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        String s ="HhhYsYhhYsd";
        s=s.toUpperCase();
        char[] chars = s.toCharArray();
        Map <Character,Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
