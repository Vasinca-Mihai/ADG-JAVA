package Lecture_7_concurrency.Philosophers;

public class Philosopher extends Thread{
    Chopstick rside, lside;
    private String name;

    public Philosopher(Chopstick rside, Chopstick lside, String name) {
        this.rside = rside;
        this.lside = lside;
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            eat();
            //sleep(1000);
            System.out.println(Thread.currentThread().getName());
        }
    }

    public void eat(){
        synchronized (rside){
            synchronized (lside){
                System.out.println(name + " is eating.");
            }
        }
        sleep(1000);
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){e.printStackTrace();}
        System.out.println(name + " slept for "+time+" milliseconds");
    }



}
