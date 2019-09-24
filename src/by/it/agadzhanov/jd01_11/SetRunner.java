package by.it.agadzhanov.jd01_11;

import java.util.ArrayList;
import java.util.HashSet;

public class SetRunner {
    public static void main(String[] args) {
        SetC<Integer> mySetC = new SetC<>();
        HashSet<Integer> myHashSet = new HashSet<>();
        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        ArrayList<Integer> myArrayList3 = new ArrayList<>();

        //Проверка add
        for (int i = 0; i < 10; i++) {
            i = (int) (Math.random()*10 + 1);
            mySetC.add(i);
            myHashSet.add(i);
        }

        System.out.println("add myHashSet: " + myHashSet + "\nadd mySetC: " + mySetC);
        System.out.println();

        //Проверка remove
        mySetC.remove(2);
        myHashSet.remove(2);

        System.out.println("remove myHashSet: " + myHashSet + "\nremove mySetC: " + mySetC);
        System.out.println();

        //Проверка contains
        System.out.println("contains myHashSet: " + myHashSet.contains(3) + "\ncontains mySetC: " + mySetC.contains(3));
        System.out.println();

        //Проверка size
        System.out.println("size myHashSet: " + myHashSet.size() + "\nsize mySetC: " + mySetC.size());
        System.out.println();

        //Проверка isEmpty
        System.out.println("isEmpty myHashSet: " + myHashSet.isEmpty() + "\nisEmpty mySetC: " + mySetC.isEmpty());
        System.out.println();

        //Проверка addAll
        myArrayList1.add(null); myArrayList1.add(null);
        myArrayList1.add(10); myArrayList1.add(1000);
        mySetC.addAll(myArrayList1);
        myHashSet.addAll(myArrayList1);
        System.out.println("addAll myHashSet: " + myHashSet + "\naddAll mySetC: " + mySetC); //Не будут всегда выдавать тот же порядок элементов, т.к. реализуют разные методы addAll
        System.out.println();

        //Проверка containsAll
        myArrayList2.add(1); myArrayList2.add(3);
        System.out.println("containsAll myHashSet: " + myHashSet.containsAll(myArrayList2) + "\ncontainsAll mySetC: " +  mySetC.containsAll(myArrayList2));
        System.out.println();

        //Проверка removeAll
        myArrayList3.add(10);
        mySetC.removeAll(myArrayList3);
        myHashSet.removeAll(myArrayList3);
        System.out.println("removeAll myHashSet: " + myHashSet + "\nremoveAll mySetC: " +  mySetC);
        System.out.println();

        //Проверка clear
        mySetC.clear();
        myHashSet.clear();
        System.out.println("clear myHashSet: " + myHashSet + "\nclear mySetC: " +  mySetC);
    }
}
