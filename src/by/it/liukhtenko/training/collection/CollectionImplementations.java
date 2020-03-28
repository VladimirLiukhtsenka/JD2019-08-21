package by.it.liukhtenko.training.collection;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.*;

public class CollectionImplementations {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<String>(){
//            {
//                this.add("first");
//                this.add("second");
//            }
//        };
//        System.out.println(set);
//        Object ob = new HashSet();
//        System.out.print((ob instanceof Set) + ", ");
//        System.out.print(ob instanceof SortedSet);
//
//        Set<Object> set1 = new LinkedHashSet<>();
//        set1.add("1");
//        set1.add("2");
//        set1.add("3");
//        set1.add(set1);
//        System.out.println(set1);            // 1
        //System.out.println(set1.hashCode());    // 2
        Queue <String> queue = new LinkedList<String>(){
            {
                this.offer("Winter");
            }
        };
        queue.add("Spring");
        queue.add("Summer");
//        queue.removeIf(s -> s.endsWith("r")); //filter
//        queue.forEach(System.out::println);
        queue.stream().filter(s -> s.endsWith("r")).forEach(System.out::println); // не меняет исходную очередь

//        queue.remove();
//        queue.forEach(System.out::println);
//        queue.clear();
//        queue.element();
    }
}
