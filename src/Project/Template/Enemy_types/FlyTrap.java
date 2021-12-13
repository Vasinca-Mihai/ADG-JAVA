package Project.Template.Enemy_types;

import Project.Template.Enemy;

public class FlyTrap extends Enemy {//ma refer la venus fly trap (plante "carnivore")
    @Override
    public void mainBehavior( int chance){
        lookForTarget(chance);
        attackTarget();
        //mainBehavior(chance);
    }
    @Override
    protected void attackTarget(){//daca decid sa adaug o vatiatie a acestei fly trap pot, spre exemplu, sa modific numai felul in care musca suprascriind metoda bite
        openMouth();
        bite();
    }
    protected void openMouth(){
        System.out.println("It opens it's mouth.");
    }
    protected void bite(){
        System.out.println("It bit.");
    }

    @Override
    protected void wanderAround() {
        System.out.println("Waiting for enemies.");
    }
}
