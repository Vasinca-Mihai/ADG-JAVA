package Lecture_3_Design_patterns.Decorators;

public class Chocolate extends Topping{
    public Chocolate(Beverage mainBeverage){
        super("Chocoalte",3,mainBeverage);
    }
}
