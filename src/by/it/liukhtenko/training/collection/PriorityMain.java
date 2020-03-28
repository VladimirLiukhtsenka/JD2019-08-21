package by.it.liukhtenko.training.collection;

import java.util.*;

public class PriorityMain {
    public static void main(String[] args) {
        Queue<String> prior = new PriorityQueue<>(Comparator.reverseOrder());
        prior.offer("J");
        prior.offer("A");
        prior.offer("V");
        prior.offer("a");
        prior.offer("2");
     //   double d = 3.;
      //  System.out.println(d);
        while (!prior.isEmpty()) {
                     System.out.println(prior.poll());
        }
    }
}
