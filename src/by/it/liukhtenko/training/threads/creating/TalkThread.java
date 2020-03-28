package by.it.liukhtenko.training.threads.creating;

import java.util.concurrent.TimeUnit;

public class TalkThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<80; i++){
            System.out.println("Talk -->"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("end Talk");
            }
        }
    }
}
