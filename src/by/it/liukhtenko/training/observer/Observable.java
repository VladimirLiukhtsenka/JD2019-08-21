package by.it.liukhtenko.training.observer;

public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
