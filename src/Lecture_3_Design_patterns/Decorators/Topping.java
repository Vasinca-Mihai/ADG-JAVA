package Lecture_3_Design_patterns.Decorators;

public abstract class Topping extends Beverage{
    private Beverage mainBeverage;

    public Topping (String description, int cost, Beverage mainBeverage){
        super(description, cost);
        this.mainBeverage = mainBeverage;
    }

    public String getDescription(){
        return mainBeverage.getDescription() + " " + super.getDescription();
    }
    public int getCost(){
        return mainBeverage.getCost() + super.getCost();
    }
}
