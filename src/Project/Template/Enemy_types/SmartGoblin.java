package Project.Template.Enemy_types;

public class SmartGoblin extends Goblin{
    @Override
    protected void attackTarget(){
        System.out.println("Attacking target with a somewhat calculated attack.");
    }
    @Override
    protected void returnToInitialPosition(){
        System.out.println("It somewhat remembers where it came from and goes in that general direction.");
    }
    @Override
    protected void wanderAround(){
        System.out.println("Searching for an enemy.");
    }
}
