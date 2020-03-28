package by.it.liukhtenko.training.observer;

import java.util.EventObject;

public class ElfEvent extends EventObject  {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ElfEvent(Object source) {
        super(source);
    }

    @Override
    public Elf getSource() {
        return (Elf)super.getSource();
    }
}
