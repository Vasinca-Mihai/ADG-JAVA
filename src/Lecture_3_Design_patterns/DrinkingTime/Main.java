package Lecture_3_Design_patterns.DrinkingTime;

public class Main {
    public static void main(String[] args) {
        IPerson duke= new Person.Builder().setName("duke").build();
        duke.walk();
        duke.drink();
    }

}
