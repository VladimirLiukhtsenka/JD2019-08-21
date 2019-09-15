package by.it.rubatskii.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class TaskA {
    public static void main(String[] args) {
        List<String> list=new ListA<>();
        list.add("ewfeffe");
        list.add("ewfeffe2");
        list.add("ewfeffe3");
        list.add("ewfeffe4");
        list.remove(3);

        System.out.println(list);

    }
}
