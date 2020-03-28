package by.it.liukhtenko.training.threads.answertoexam;

public class CounterThread extends Thread {
    public static Integer count = 0;

    public void increment() {
        count++;
    }

    @Override
    public void run() {
        increment();
    }

    public int getValue() {
        return count;
    }
}

