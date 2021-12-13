package Project.Template.Enemy_types;

import Project.Template.Enemy;

public class CriiperTM extends Enemy {
    @Override
    protected void attackTarget(){
        System.out.println("It blew up!");
    }
    @Override
    protected void returnToInitialPosition(){}//it can't since it blew up.
}
