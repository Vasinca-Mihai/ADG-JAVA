package Lecture_7_concurrency.Rabbits;

public class RabbitThread extends Thread{
    private int number;
    public RabbitThread(int i){
        this.number = i;
    }

    @Override
    public void run(){
        System.out.println("Rabbit number "+number+" is running");
    }
}
