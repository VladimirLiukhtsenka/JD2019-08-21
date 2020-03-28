package by.it.liukhtenko.training.observer;

import java.util.EventObject;

public interface Observer <T extends EventObject>{
    // данные вытаскиваем из эльфа, результаты вставляются в warehouse
    void actionPerfofemed(Elf elf);

    void  actionPerfofemed(T t);
}
