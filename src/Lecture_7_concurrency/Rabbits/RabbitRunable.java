package Lecture_7_concurrency.Rabbits;

public class RabbitRunable implements Runnable{
    private int number;
    public RabbitRunable(int i){
        this.number = i;
    }

    @Override
    public void run(){
        System.out.println("Rabbit number "+number+" is running");
    }
}
