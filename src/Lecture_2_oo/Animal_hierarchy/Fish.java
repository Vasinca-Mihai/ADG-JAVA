package Lecture_2_oo.Animal_hierarchy;

public class Fish extends Animal implements Pet{
    String name;

    public Fish(String nume){
        super(0);
        this.name = nume;
    }
    public Fish(){
        super(0);//nu stiu cum pot accesa celallt constructor prin this keyword
        this.name="";
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println("the fish eats.");
    }
    public void play(){
        System.out.println("the fish swims.");
    }
    public void walk(){
        System.out.println("Fish can't walk");
    }

}
