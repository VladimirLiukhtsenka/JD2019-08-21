package by.it.zavadski.jd01_12;

import java.util.*;

public class TaskB2 {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("Person1");
        arrayList.add("Person2");
        arrayList.add("Person3");
        arrayList.add("Person4");
        arrayList.add("Person5");
        arrayList.add("Person6");
        arrayList.add("Person7");
        arrayList.add("Person8");
        linkedList.add("Person1");
        linkedList.add("Person2");
        linkedList.add("Person3");
        linkedList.add("Person4");
        linkedList.add("Person5");
        linkedList.add("Person6");
        linkedList.add("Person7");
        linkedList.add("Person8");
        linkedList.add("Person9");
        process(arrayList);
        process(linkedList);
        System.out.println(process(arrayList));
        System.out.println(process(linkedList));

    }

     static String process(ArrayList<String> peoples) {
        int index = 0;
        while (peoples.size() != 1) {
            peoples.remove(index + 1 % peoples.size());
        }
        return peoples.get(0);
    }

     static String process(LinkedList<String> peoples) {
         int counter = 0;
         Iterator<String> iterator = peoples.iterator();
         while (peoples.size()!=1){
             if(iterator.hasNext()){
                 iterator.next();
                 counter++;
                 if(counter==2){
                     iterator.remove();
                     counter=0;
                 }
             }
             else{
                 iterator=peoples.iterator();
             }
         }
         return peoples.get(0);
     }
}