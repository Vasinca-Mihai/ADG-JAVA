package Lecture_2_oo.TwoFighters;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("John Cena (c)",20,5);
        Fighter fighter2 = new Fighter("Mike Tyson (c)",20,5);
        String winner;
        winner = new BoxingMatch(fighter1,fighter2).Fight(fighter1,fighter2);
        System.out.println("The winner is: "+winner);


    }
}
