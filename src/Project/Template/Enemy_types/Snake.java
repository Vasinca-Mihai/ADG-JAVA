package Project.Template.Enemy_types;

import Project.Template.Enemy;

public class Snake extends Enemy {
    @Override
    protected void goToTarget(){
        System.out.println("Slithering toward target.");
    }
    @Override
    protected void attackTarget(){
        System.out.println("Biting target.");
    }
}
