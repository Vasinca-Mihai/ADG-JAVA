package Project.Template.Enemy_types;

import Project.Template.Enemy;

import java.util.Random;

public class Goblin extends Enemy {

    @Override
    protected void attackTarget(){
        System.out.println("Attacking target with a weak attack.");
    }
    @Override
    protected void returnToInitialPosition(){
        System.out.println("It got lost and does not know how to return.");
    }
}
