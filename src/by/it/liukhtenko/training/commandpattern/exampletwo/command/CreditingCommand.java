package by.it.liukhtenko.training.commandpattern.exampletwo.command;

import by.it.liukhtenko.training.commandpattern.exampletwo.Receiver;

public class CreditingCommand implements ICommand {
    private Receiver receiver;
    public CreditingCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    public void execute() {
        receiver.action(CommandTypes.CREDITING);
    }
}