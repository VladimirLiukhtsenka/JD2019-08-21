package by.it.liukhtenko.training.lambda;

public class Radio implements ElectricityConsumer{


    public  void playMusic(){
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
