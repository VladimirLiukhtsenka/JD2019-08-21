package by.it.liukhtenko.training;

import java.util.ArrayList;
import java.util.Iterator;

public class Tesr {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);

        b.add(1);
        b.add(3);
        b.add(6);

        System.out.println(a);
        System.out.println(b);
        Tesr r = new Tesr();
        r.merge(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        Iterator<Integer> iterator = a.iterator();
        int counterA = 0;
        int counterB = 0;
        boolean flag = false;
        while (iterator.hasNext() && counterA < a.size() && counterB < b.size()) {
            if (a.get(counterA) > b.get(counterB)) {
                a.add(counterA, b.get(counterB));
                counterB++;
                flag = true;
            } else if (counterA == b.size()) {
                if (a.get(a.size() - 1) > b.get(b.size() - 1)) {
                    a.add(a.size() - 1, b.get(counterB));
                } else {
                    a.add(a.size(), b.get(counterB));
                }
                counterB++;
                flag = true;
            } else if (counterA > b.size()) {
                a.add(a.size(), b.get(counterB));
                if (counterB == b.size()) {
                    break;
                }
                counterB++;
            }
            counterA++;
        }
        if (!flag) {
            a.addAll(b);
        }
    }
}
