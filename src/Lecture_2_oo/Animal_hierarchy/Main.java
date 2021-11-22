package Lecture_2_oo.Animal_hierarchy;

public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.play();
        System.out.println(c.getName());
        a.eat();
        a.walk();
        e.walk();
        e.eat();
        p.play();
        p.getName();
        p.setName("2Fluffy");
    }
}
