package Lecture_8_Functional.ex2;

public class Test {
    private int j;
    public static void main(String[] args) {
        new Test().testLmabda();
    }

    public int testLmabda(){
        int i=0;
        j++;
        Runnable r = () -> {
            System.out.println(i);
            System.out.println(this.j);
        };
        r.run();
        return i;
    }
}
