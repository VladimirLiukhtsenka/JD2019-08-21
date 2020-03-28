package by.it.liukhtenko.training.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Elf extends Unit implements Observable  {
    private int id;
    private int hitpoint;
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public Elf(int id, int hitpoint, String name) {
        this.id = id;
        this.hitpoint = hitpoint;
        this.name = name;
    }

    public int getId() {
        return id;
    }
//!!!
    public void setId(int id) {

        this.id = id;
        notifyObserver();
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return id == elf.id &&
                hitpoint == elf.hitpoint &&
                Objects.equals(name, elf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hitpoint, name);
    }

    @Override
    public void attach(Observer observer) {
    observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for( Observer o :observers ){
     //       Observer.actionPerfofemed(this)
        }
    }
}
