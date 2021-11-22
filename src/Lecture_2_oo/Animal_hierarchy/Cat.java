package Lecture_2_oo.Animal_hierarchy;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String nume){
        super(4);
        this.name = nume;
    }

    public Cat(){
        super(4);//nu stiu cum pot accesa celallt constructor prin this keyword
        this.name = "";
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println("the cat eats.");
    }
    public void play(){
        System.out.println("the cat purrs.");
    }
}
