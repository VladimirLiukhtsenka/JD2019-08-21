package by.it.liukhtenko.training.commandpattern.exampleone;

public class Invoker {
    private ICommand mCommand;
    public Invoker(ICommand command) {
        mCommand = command;
    }
    public void invokeCommand() {
        System.out.println("Обратитесь к команде для выполнения ---Invoker");
        mCommand.execute();
    }
}
