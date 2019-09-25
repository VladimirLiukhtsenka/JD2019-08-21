package by.it.yuntsevich.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class TaskB3 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        LinkedList<String> peopleLinked = new LinkedList<>();
        for (int i = 1; i < 4097; i++) {
            people.add("a" + i);
            peopleLinked.add("s");
        }
        long start1 = System.currentTimeMillis();
        System.out.println(process(people));
        start1 = System.currentTimeMillis() - start1;

        long start2 = System.currentTimeMillis();
        System.out.println(process(peopleLinked));
        start2 = System.currentTimeMillis() - start2;

        System.out.println("people " + start1+ " peopleLinked " + start2);
    }

    private static String process(ArrayList<String> peoples) {
        int count = 0;
        while (peoples.size() > 1) {
            Iterator<String> it = peoples.iterator();
            while (it.hasNext()) {
                it.next();
                count++;
                if (count % 2 == 0) {
                    it.remove();
                }

            }
        }
        return peoples.get(0);
    }

    private static String process(LinkedList<String> peoples) {
        int count = 0;
        while (peoples.size() > 1) {
            Iterator<String> it = peoples.iterator();
            while (it.hasNext()) {
                it.next();
                count++;
                if (count % 2 == 0) {
                    it.remove();
                }

            }
        }
        return peoples.get(0);
    }
}



