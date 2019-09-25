package by.it.akhrem.jd01_12;

import java.util.*;

public class TaskC1 {
    public static void main(String[] args) {
        Map<Integer, String> wMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String strValue = sc.nextLine();
            if (strValue.equals("end")) break;
            int val= Objects.hashCode(strValue);
            wMap.put(val, strValue);
        }
        for(Map.Entry<Integer, String> entry: wMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
