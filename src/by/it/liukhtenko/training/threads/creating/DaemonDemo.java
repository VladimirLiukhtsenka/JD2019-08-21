package by.it.liukhtenko.training.threads.creating;

public class DaemonDemo {
    public static void main(String[] args) {
        WalkThread walkThread = new WalkThread();
        Thread talkThread = new Thread(new TalkThread());
        talkThread.setDaemon(true);
        walkThread.start();
        talkThread.start();
        System.out.println("end");
    }
}
