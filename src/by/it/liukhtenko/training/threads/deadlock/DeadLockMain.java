package by.it.liukhtenko.training.threads.deadlock;

        import java.sql.SQLOutput;

public class DeadLockMain {
    public static void main(String[] args) {
        InviteAction invite1 = new InviteAction("first");
        InviteAction invite2 = new InviteAction("second");
        new Thread(() -> invite1.invite(invite2)).start();
        new Thread(() -> invite2.invite(invite1)).start();
    }
}
