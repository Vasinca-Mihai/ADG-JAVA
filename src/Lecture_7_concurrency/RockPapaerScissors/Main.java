package Lecture_7_concurrency.RockPapaerScissors;

public class Main {
    public Player findWinner(Player p1,Player p2){
        Player winner = null;

        if(p1.getOption().equals("rock")){
            if(p2.getOption().equals("papaer")){
                winner = p2;
            }
            else if(p2.getOption().equals("scissor")){
                winner = p1;
            }
        }

        if(p1.getOption().equals("paper")){
            if(p2.getOption().equals("rock")){
                winner = p1;
            }
            else if(p2.getOption().equals("scissor")){
                winner = p2;
            }
        }
        if(p1.getOption().equals("scissor")){
            if(p2.getOption().equals("papaer")){
                winner = p1;
            }
            else if(p2.getOption().equals("rock")){
                winner = p2;
            }
        }

        return winner;
    }

    public static void main(String[] args) throws  InterruptedException{
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        Player winner = new Main().findWinner(p1,p2);
        if(winner != null){
            System.out.println("The winner is: "+winner);
        }else {
            System.out.println("Draw");
        }
    }
}
