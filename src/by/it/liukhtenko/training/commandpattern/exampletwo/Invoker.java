package by.it.liukhtenko.training.commandpattern.exampletwo;

import by.it.liukhtenko.training.commandpattern.exampletwo.command.ICommand;

public class Invoker {
    private ICommand mCommand;
    public Invoker(ICommand command) {
        mCommand = command;
    }
    public void invokeCommand() {
        System.out.println("Refer to command for execution");
        mCommand.execute();
    }
}
