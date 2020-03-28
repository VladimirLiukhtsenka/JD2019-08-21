package by.it.liukhtenko.training.commandpattern.exampletwo.command;

import by.it.liukhtenko.training.commandpattern.exampletwo.Receiver;

public class WithdrawingCommand implements ICommand {
    private Receiver receiver;
    public WithdrawingCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute() {
        receiver.action(CommandTypes.WITHDRAWING);
    }
}
