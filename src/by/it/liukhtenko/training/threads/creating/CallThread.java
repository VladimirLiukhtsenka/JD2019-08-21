package by.it.liukhtenko.training.threads.creating;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallThread implements Callable<String> {
    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            System.out.println("Call " + i);
            sb.append("Call " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
