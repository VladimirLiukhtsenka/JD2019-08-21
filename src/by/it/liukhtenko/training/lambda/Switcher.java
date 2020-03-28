package by.it.liukhtenko.training.lambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List< ElectricityConsumer > listeners =new ArrayList<>();
    public void addElectricitylistener (ElectricityConsumer listener){
        listeners.add(listener);
    }
    public void removeElectricitylistener (ElectricityConsumer listener){
        listeners.remove(listener);
    }
    public void switchOn (){
        System.out.println("switch on");
      //  if (consumer != null){
      //      consumer.electricityOn();
        for (ElectricityConsumer consumer : listeners){
            consumer.electricityOn();
        }
    }
}
