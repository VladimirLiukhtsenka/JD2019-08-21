package by.it.liukhtenko.training.threads.creating;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        // walk.run(); - просто вызов run в потоке main
        walk.start();
        Thread talk = new Thread(new TalkThread());
        talk.start();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future <String> future = executorService.submit(new CallThread());
        try {
            String result =  future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
       // executorService.shutdown(); // прекращние работы  executorService (все запущенные потоки отработают)
        executorService.shutdownNow(); // прекращается работа не только самого обработчкика но и всех потоков



    }
}
