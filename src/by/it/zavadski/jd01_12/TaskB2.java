package by.it.zavadski.jd01_12;

import java.util.*;

public class TaskB2 {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of people");
        int number=scanner.nextInt(); //Get number of people from user
        for (int i = 0; i <number ; i++) {
                arrayList.add("Person"+(i+1));
                linkedList.add("Person"+(i+1));
        }
//        arrayList.add("Person1");
//        arrayList.add("Person2");
//        arrayList.add("Person3");
//        arrayList.add("Person4");
//        arrayList.add("Person5");
//        arrayList.add("Person6");
//        arrayList.add("Person7");
//        arrayList.add("Person8");
//        arrayList.add("Person9");
        System.out.println(arrayList);
        System.out.println(process(arrayList));
//        linkedList.add("Person1");
//        linkedList.add("Person2");
//        linkedList.add("Person3");
//        linkedList.add("Person4");
//        linkedList.add("Person5");
//        linkedList.add("Person6");
//        linkedList.add("Person7");
//        linkedList.add("Person8");
//        linkedList.add("Person9");
        System.out.println(linkedList);
        System.out.println(process(linkedList));

    }

     static String process(ArrayList<String> peopleArr) {
        int index = 0;
        while (peopleArr.size() != 1) {
            peopleArr.remove(index + 1 % peopleArr.size());
            peopleArr.trimToSize();
        }
        return peopleArr.get(0);
    }

     static String process(LinkedList<String> people) {
         int counter = 0;
         while (people.size() != 1) {
             ListIterator<String> iterator = people.listIterator();
             while (iterator.hasNext()) {
                 if (counter % 2 == 0) {
               iterator.next();
                 iterator.remove();
                  counter++;
                 } else {
                     iterator.next();
                     counter++;
                 }
             }
         }
         return people.get(0);
     }
}