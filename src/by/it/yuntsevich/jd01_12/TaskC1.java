package by.it.yuntsevich.jd01_12;

import java.util.*;

public class TaskC1 {public static void main(String[] args) {
    Map<Long, String> map = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    for(;;) {
        String word = sc.nextLine();
        if (word.equals("end")) break;
        long uniqueValue= System.nanoTime()/1000;
        map.put(uniqueValue, word);
    }
    Collection<String> list = map.values();
    for(Iterator<String> itr = list.iterator(); itr.hasNext();)
    {
        if(Collections.frequency(list, itr.next())>1)
        {
            itr.remove();
        }
    }
    for(Map.Entry<Long, String> entry: map.entrySet())
        System.out.println(entry.getKey() + " " + entry.getValue());
}


}
