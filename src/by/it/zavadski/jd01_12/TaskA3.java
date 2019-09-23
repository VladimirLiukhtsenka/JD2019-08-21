package by.it.zavadski.jd01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        String string;
        int position=0;
        while (!(string=scan.next()).equals("end")){
            Integer value=Integer.valueOf(string);
            if (value>0)
                arrayList.add(position++,value);
            else if (value==0)
                arrayList.add(position,0);
            else
                arrayList.add(value);
        }
        System.out.println(arrayList);
    }
}
