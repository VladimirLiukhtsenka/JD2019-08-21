package by.it.kiturka.jd01_11;

import java.util.List;

public class TaskA {

    public static void main(String[] args) {
        List<String> list=new ListA<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        list.add("Java4");
        list.add("Java5");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }

}
