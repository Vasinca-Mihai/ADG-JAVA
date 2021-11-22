package Lecture_1.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        for(int i = 0;i<=100;i++){
            if((i % 3) == 0){System.out.print("FIzz "); flag = false;}
            if((i % 5) == 0){System.out.print("Buzz "); flag = false;}
            if((i % 7) == 0){System.out.print("Rizz "); flag = false;}
            if((i % 11) == 0){System.out.print("Jazz "); flag = false;}
            if(flag){System.out.print(i);}
            System.out.println("");
            flag = true;
        }

    }
}
