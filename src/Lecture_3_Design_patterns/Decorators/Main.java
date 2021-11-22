package Lecture_3_Design_patterns.Decorators;

public class Main {
    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        Topping milk = new Milk(coffe);
        Beverage whip = new Whip(milk);

        System.out.println(whip.getDescription());
        System.out.println(whip.getCost());

        Tea tea = new Tea();
        Milk teaMilk = new Milk(tea);
        System.out.println(teaMilk.getDescription());
        System.out.println(teaMilk.getCost());
    }
}
