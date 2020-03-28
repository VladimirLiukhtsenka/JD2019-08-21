package by.it.liukhtenko.training.commandpattern.exampletwo;

import by.it.liukhtenko.training.commandpattern.exampletwo.command.*;

public class Client {
    private Receiver cReceiver;
    public Client(Receiver receiver) {
        cReceiver = receiver;
    }
    public ICommand initCommand(CommandTypes cmd) {
        ICommand command = null;
        switch(cmd) {
            case CREDITING:
                System.out.println("Creating command CREDITING & set up its receiver");
                command = new CreditingCommand(cReceiver);
                break;
            case WITHDRAWING:
                System.out.println("Creating command WITHDRAWING & set up its receiver");
                command = new WithdrawingCommand(cReceiver);
                break;
            case BLOCKING:
                System.out.println("Creating command BLOCKING & set up its receiver");
                command = new BlockingCommand(cReceiver);
                break;
        }
        return command;
    }
}

