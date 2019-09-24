package by.it.akhrem.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskB3 {

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
        ArrayList<String> arrayLst = new ArrayList<>();
        LinkedList<String> linkedLst = new LinkedList<>();
        for (int i = 1; i<4097; i++){
            arrayLst.add("n"+i);
            linkedLst.add("n"+i);
        }
        long t1= System.nanoTime();
        String arrayStr = process(arrayLst);

        t1 = System.nanoTime() - t1;
        long t2 = System.nanoTime();
        String linkedStr = process(linkedLst);
        t2 = System.nanoTime() - t2;
        System.out.println("ArrayList t1 =" + t1/1000.0+ " LinkedList t2 = " + t2/1000.0);
    }
}
