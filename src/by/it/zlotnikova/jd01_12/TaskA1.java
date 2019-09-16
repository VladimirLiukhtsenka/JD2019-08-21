package by.it.zlotnikova.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TaskA1 {

    private List<Integer> marks = new ArrayList<>();

    private void clearBad(List<Integer> grades) {
        Iterator<Integer> it = grades.iterator();
        while (it.hasNext()) {
            if (it.next() < 4) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        TaskA1 task = new TaskA1();
        Random rnd = new Random();
        for (int i = 0; i < 25; i++) {
            task.marks.add(rnd.nextInt(10) + 1);
        }
        System.out.println(task.marks);
        task.clearBad(task.marks);
        System.out.println(task.marks);
    }
}
