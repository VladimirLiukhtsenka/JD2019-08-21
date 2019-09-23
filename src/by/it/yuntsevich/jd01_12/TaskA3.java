package by.it.yuntsevich.jd01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    int position =0;
    Scanner sc = new Scanner(System.in);
    for(;;){
        String value = sc.next();
        if (value.equals("end")) break;
        Integer i = Integer.valueOf(value);
        if (i<0) list.add(i);
        else if (i==0)
            list.add(position,i);
        else list.add(position++,i);

    }
        System.out.println(list);
    }
}
