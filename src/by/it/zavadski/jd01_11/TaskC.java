package by.it.zavadski.jd01_11;

import java.util.Set;

public class TaskC {
    public static void main(String[] args) {
        Set<String> set=new SetC<>();
        set.add("Hello1");
        set.add("Hello2");
        set.add("Hello3");
        set.add("Hello4");
        set.add("Hello5");
        set.add("Hello6");
        set.add("Hello7");
        System.out.println(set);
        set.remove(2);
        System.out.println(set);

    }
}
