package by.it.liukhtenko.training.lambda;

import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void fire() {
        System.out.println("Fire ... from Fire");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        //event subscribe (подписка на событие)
        sw.addElectricitylistener(lamp);
        sw.addElectricitylistener(radio);
        sw.addElectricitylistener(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("Fire!...from anonymous CLASS");
            }
        });

        sw.addElectricitylistener(
                //(параметры) -> тело
                // () -> System.out.println("Fire!...from lambda")
                () -> fire()
        );
        sw.addElectricitylistener(Main::fire);

        sw.switchOn();

    }
}
