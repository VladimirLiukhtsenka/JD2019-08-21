package by.it.liukhtenko.training.threads.deadlock;

public class InviteAction {
    public String name;

    public InviteAction(String name) {
        this.name = name;
    }

    public synchronized void invite(InviteAction obj) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {// TODO: 07.01.2020 Why?
            e.printStackTrace();
        }
        System.out.println(name + " invites " + obj.name.toUpperCase());
        obj.action();


    }

    public synchronized void action() {
        System.out.println(name+" action");
    }
}
