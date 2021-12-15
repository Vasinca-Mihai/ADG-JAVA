package Project.Template;

import java.util.Random;

public class Enemy {
    public void mainBehavior( int chance){
        lookForTarget(chance);
        goToTarget();
        getInPosition();
        attackTarget();
        returnToInitialPosition();
    }
    protected void lookForTarget( int comparator){ //in mod normal ar returna un obiect cum ar fi alt enemy sau un player sau ceva similar
        boolean hasFound = false;
        while (!hasFound){
            if(getRandomNumber()>comparator){wanderAround();}
            else{
                System.out.println("Target acquired.");
                hasFound = true;
            }
        }
    }
    protected void goToTarget (){// ar primi un obiect dat de o metoda getTarget()
        System.out.println("Walking toward target.");
    }
    protected void getInPosition(){
        System.out.println("Finished moving.");
    }
    protected void attackTarget(){//ar primi acelasi obiect ca metoda goToTarget()
        System.out.println("Attacking target.");
    }
    protected void wanderAround(){
        System.out.println("Wandering around.");
    }
    protected void returnToInitialPosition(){
        System.out.println("It goes back to where it came from.");
    }
    protected int getRandomNumber(){return new Random().nextInt(100);}

}