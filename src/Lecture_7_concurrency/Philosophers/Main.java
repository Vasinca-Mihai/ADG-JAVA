package Lecture_7_concurrency.Philosophers;

public class Main {

    public static void main(String[] args) {
        /*stiu ca in consola pare ca toti cinci mananca in acelasi timp , dar ei defapt asteapta sa se elibereze betele apoi mananca inainte sa apara mesajul de x has slept n milliseconds*/
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();

        Philosopher p1 = new Philosopher(c1,c2,"Philosopher1");
        Philosopher p2 = new Philosopher(c2,c3,"Philosopher2");
        Philosopher p3 = new Philosopher(c3,c4,"Philosopher3");
        Philosopher p4 = new Philosopher(c4,c5,"Philosopher4");
        Philosopher p5 = new Philosopher(c5,c1,"Philosopher5");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        try{p1.join();} catch (InterruptedException e){e.printStackTrace();}
        try{p2.join();} catch (InterruptedException e){e.printStackTrace();}
        try{p3.join();} catch (InterruptedException e){e.printStackTrace();}
        try{p4.join();} catch (InterruptedException e){e.printStackTrace();}
        try{p5.join();} catch (InterruptedException e){e.printStackTrace();}

        System.out.println("program terminated");

    }
}
