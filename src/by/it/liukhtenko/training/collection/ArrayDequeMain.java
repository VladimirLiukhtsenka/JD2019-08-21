package by.it.liukhtenko.training.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeMain {
    public static void main(String[] args) {
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        Deque <Integer> queue = new ArrayDeque<>();
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);
        Iterator<Integer> integerIterator = queue.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }
    }
}
