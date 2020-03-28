package by.it.liukhtenko.training.lambda;

public class Lamp implements ElectricityConsumer {

    public void lightOn(){
        System.out.println("Lamp is shine ");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
