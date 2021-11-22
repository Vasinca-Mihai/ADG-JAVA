package Lecture_3_Design_patterns.Builder;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("popescu").job("driver").drivingLicense("B2").isMarried(false).university("None").build();
        Person p2 = new Person.Builder("Andrei").build();
        System.out.println(p1);
        System.out.println(p2);
    }
}
