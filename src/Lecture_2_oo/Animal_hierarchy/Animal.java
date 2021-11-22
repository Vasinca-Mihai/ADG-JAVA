package Lecture_2_oo.Animal_hierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal (int legs){
        this.legs=legs;
    }

    abstract void eat();
    protected void walk(){
        System.out.println("It walks on "+this.legs+" legs.");
    }
}
