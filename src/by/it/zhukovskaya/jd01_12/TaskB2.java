package by.it.zhukovskaya.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskB2 {
    static String process(ArrayList<String> peoples) {
        int cnt = 0;
        while (peoples.size() > 1) {
            Iterator<String> itr = peoples.iterator();

            while (itr.hasNext()) {
                itr.next();
                cnt++;
                if (cnt % 2 == 0)
                    itr.remove();
            }
        }
        if (peoples.size() == 1)
            return peoples.get(0);
        else return null;
    }

    static String process(LinkedList<String> peoples) {
        int cnt = 0;
        while (peoples.size() > 1) {
            Iterator<String> itr = peoples.iterator();

            while (itr.hasNext()) {
                itr.next();
                cnt++;
                if (cnt % 2 == 0)
                    itr.remove();
            }
        }
        if (peoples.size() == 1)
            return peoples.get(0);
        else return null;
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("n1");
        a.add("n2");
        a.add("n3");
        System.out.println(a);
        System.out.println(process(a));
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Anton");
        ll.add("Sergei");
        ll.add("Andrej");
        System.out.println(ll);
        System.out.println(process(ll));

    }

}
