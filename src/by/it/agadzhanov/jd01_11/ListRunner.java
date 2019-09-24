package by.it.agadzhanov.jd01_11;

import java.util.ArrayList;
import java.util.HashSet;

public class ListRunner {
    public static void main(String[] args) {
        ListA<String> myListA = new ListA<>();
        ListB<String> myListB = new ListB<>();
        ArrayList<String> myArrayList = new ArrayList<>();

        //Проверка add(element)
        myListA.add("First"); myListA.add("Second");
        myListA.add("Third"); myListA.add("Fourth");

        myListB.add("First"); myListB.add("Second");
        myListB.add("Third"); myListB.add("Fourth");

        myArrayList.add("First"); myArrayList.add("Second");
        myArrayList.add("Third"); myArrayList.add("Fourth");

        System.out.println("add(element) myListA: " + myListA + "\nadd(element) myArrayList: " + myArrayList);
        System.out.println();

        //Проверка remove
        myListA.remove(2);
        myListB.remove(2);
        myArrayList.remove(2);
        System.out.println("remove myListA: " + myListA + "\nremove myArrayList: " + myArrayList);
        System.out.println();

        //Проверка get
        String myListAElement = myListA.get(2);
        String myArrayListElement = myArrayList.get(2);
        System.out.println("get myListAElement: " + myListAElement + "\nget myArrayListElement: " + myArrayListElement);
        System.out.println();

        //Проверка set
        String oldMyListBElement = myListB.set(2,"New Element");
        String oldMyArrayListElement = myArrayList.set(2,"New Element");
        System.out.println("set myListB: " + myListB + "\nset myArrayList: " + myArrayList);
        System.out.println("set oldMyListBElement: " + oldMyListBElement + "\nset oldMyArrayListElement: " + oldMyArrayListElement);
        System.out.println();

        //Проверка add(index,element)
        myListB.add(1,null);
        myArrayList.add(1,null);
        System.out.println("add(index,element) myListB: " + myListB + "\nadd(index,element) myArrayList: " + myArrayList);
        System.out.println();

        //Проверка addAll
        myListB.addAll(myArrayList);
        myArrayList.addAll(myArrayList);
        System.out.println("addAll myListB: " + myListB + "\naddAll myArrayList: " + myArrayList);
    }
}
