package Lecture_7_concurrency.interference_Ex;

public class Main {
    public static int v=0;

    public static void main(String[] args) throws Exception{
        System.out.println(v);
        Object lock = new  Object();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (lock){v++;}
                System.out.println(v);
            }
        };

        for(int i =0;i<500;i++){
            (new Thread(runnable)).start();
        }
        Thread.sleep(1000);
        System.out.println("result: "+v);
    }
}
