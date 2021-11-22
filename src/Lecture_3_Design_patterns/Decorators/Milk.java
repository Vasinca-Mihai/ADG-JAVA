package Lecture_3_Design_patterns.Decorators;

public class Milk extends Topping{
    public Milk(Beverage mainBeverage){
        super("Milk",3,mainBeverage);
    }
}
