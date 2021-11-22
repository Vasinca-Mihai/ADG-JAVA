package Lecture_3_Design_patterns.Decorators;

public class Whip extends Topping{
    public Whip (Beverage mainBeverage){
        super("Whip",2,mainBeverage);
    }
}
