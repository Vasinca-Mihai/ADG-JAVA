package Project.Template.Enemy_types;

import Project.Template.Enemy;

public class Warden extends Enemy {
    @Override
    protected void wanderAround(){
        System.out.println("Patrolling");
    }
    @Override
    protected void returnToInitialPosition(){
        System.out.println("It goes back to it's post.");
    }
}
