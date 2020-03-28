package by.it.liukhtenko.training.commandpattern.exampletwo.command;

import by.it.liukhtenko.training.commandpattern.exampletwo.Receiver;

public class BlockingCommand implements ICommand {
    private Receiver receiver;
    public BlockingCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    public void execute() {
        receiver.action(CommandTypes.BLOCKING);
    }
}
