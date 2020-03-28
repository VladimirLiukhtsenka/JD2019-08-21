package by.it.liukhtenko.training.threads.creating;

public class PriorityDemo {
    public static void main(String[] args) {
        WalkThread walkThread = new WalkThread();
        Thread talk = new Thread(new TalkThread());
        talk.setPriority(Thread.MAX_PRIORITY);
        walkThread.setPriority(Thread.MIN_PRIORITY);
        talk.start();
        walkThread.start();
    }
}
