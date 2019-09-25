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
        int counter = 1; //Счетчик
        while (peopleArr.size() != 1) { //Делаем пока размер списка не равен 1
            ListIterator<String> iterator = peopleArr.listIterator(); //Создаем итератор
            while (iterator.hasNext()) { //Делаем пока у итератора есть элемент
                if (counter % 2 == 0) { //Проверяем что счетчик кратен 2, Но похоже тут нулевой т.е. первый элемент удаляется
                    iterator.next();// берем следующий элемент
                    iterator.remove();//удаляем
                    counter++;//увеличиваем счетчик
                } else {
                    iterator.next(); //итератор берет слудующий элемент
                    counter++;//увеличиваем счетчик
                }
            }
        }
        return peopleArr.get(0);//возвращаем единственный оставшийся элемент
    }

    static String process(LinkedList<String> people) {
        int counter = 1; //Счетчик
        while (people.size() != 1) { //Делаем пока размер списка не равен 1
            ListIterator<String> iterator = people.listIterator(); //Создаем итератор
            while (iterator.hasNext()) { //Делаем пока у итератора есть элемент
                if (counter % 2 == 0) { //Проверяем что счетчик кратен 2, Но похоже тут нулевой т.е. первый элемент удаляется
                    iterator.next();// берем следующий элемент
                    iterator.remove();//удаляем
                    counter++;//увеличиваем счетчик
                } else {
                    iterator.next(); //итератор берет слудующий элемент
                    counter++;//увеличиваем счетчик
                }
            }
        }
        return people.get(0);//возвращаем единственный оставшийся элемент
    }
}