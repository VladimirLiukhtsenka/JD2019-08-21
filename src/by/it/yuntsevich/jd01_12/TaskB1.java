package by.it.yuntsevich.jd01_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(;;){
            String line = sc.next();
            if (line.equals("end")) break;
            line = line.replaceAll("[.?!()\",—:;]", "");
            list.add(line);
        }
        for (int i = 0; i < list.size(); i++) {
            int count =0;
            for (String aList : list) {
                if (list.get(i).equals(aList))
                    count++;

            }
            map.putIfAbsent(list.get(i), count);

        }
        for (Map.Entry entry: map.entrySet()) {

            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
