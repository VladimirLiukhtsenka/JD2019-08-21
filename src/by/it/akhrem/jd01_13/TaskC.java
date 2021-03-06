package by.it.akhrem.jd01_13;

import java.util.*;

public class TaskC {

    static LinkedList<Double> dblList = new LinkedList<>();
    static int catchCnt = 0;
    static Scanner sc;

    public static void main(String[] args) throws InterruptedException  {
        sc = new Scanner(System.in);
        for(;;) {
            readData();
        }
    }

    static void readData() throws InterruptedException {
        int maxCatchCount = 5;
        try {
            double val = sc.nextDouble();
            dblList.add(val);
        } catch (InputMismatchException e) {
            Thread.sleep(100);
            catchCnt++;
            if (catchCnt > maxCatchCount)
                throw e;
            sc.nextLine();
            Iterator<Double> itr = dblList.descendingIterator();
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
        }

     }
}
