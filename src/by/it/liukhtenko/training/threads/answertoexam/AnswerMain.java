package by.it.liukhtenko.training.threads.answertoexam;


import java.util.Arrays;

public class AnswerMain {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;
        int[] array = new int[n];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            CounterThread counter = new CounterThread();
            counter.start();
            counter.join();
            array[i] = counter.getValue();
        }
        System.out.println(Arrays.toString(array));
    }
}
