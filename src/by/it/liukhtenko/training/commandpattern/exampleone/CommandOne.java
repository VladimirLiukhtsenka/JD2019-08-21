package by.it.liukhtenko.training.commandpattern.exampleone;

public class CommandOne implements ICommand {
    private Receiver receiver;

    public CommandOne(Receiver reciever) {
        this.receiver = reciever;
    }

    public void execute() {
        System.out.println("Определить связь between receiver and action");
        receiver.action(TypeCommand.ONE);
    }
}
