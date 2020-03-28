package by.it.liukhtenko.training.commandpattern.exampletwo;

import by.it.liukhtenko.training.commandpattern.exampletwo.command.CommandTypes;
import by.it.liukhtenko.training.commandpattern.exampletwo.command.ICommand;

public class BankExample {
    public static void main(String[] args) {
        Account account = new Account(210012, 1100, false);
        Receiver receiver = new Receiver(account);
        Client client = new Client(receiver);
        ICommand commandCrediting = client.initCommand(CommandTypes.CREDITING);
        Invoker invokerCrediting = new Invoker(commandCrediting);
        invokerCrediting.invokeCommand();
        ICommand commandWithdrawing = client.initCommand(CommandTypes.WITHDRAWING);
        Invoker invokerWithdrawing = new Invoker(commandWithdrawing);
        invokerWithdrawing.invokeCommand();
        ICommand commandBlocking = client.initCommand(CommandTypes.BLOCKING);
        Invoker invokerBlocking = new Invoker(commandBlocking);
        invokerBlocking.invokeCommand();
    }
}
