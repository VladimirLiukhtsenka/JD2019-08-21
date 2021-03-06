package by.it.yuntsevich.jd01_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC {
    static Scanner sc;

    public static void main(String[] args) throws InterruptedException {
         sc = new Scanner(System.in);
        readData();
    }

    private static void readData() throws InterruptedException {
        List<Double> list = new ArrayList<>();
        int counter = 0;
        for (; ; ) {
            try {
                String line = sc.next();
                Double value = Double.valueOf(line);
               if (value.isNaN()) throw new Exception();
                list.add(value);
            }
            catch (Exception e) {
                    Thread.sleep(100);
                    for (int i=list.size()-1;i>=0; i--) {
                        System.out.print(list.get(i) + " ");
                    }
                System.out.println();
                counter++;
                if (counter == 5) {
                    throw new RuntimeException();
            }
            }
        }
    }
}


