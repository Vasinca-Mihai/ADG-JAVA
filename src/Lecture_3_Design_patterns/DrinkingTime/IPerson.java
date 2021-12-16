package Lecture_3_Design_patterns.DrinkingTime;

public interface IPerson {
        void walk();

        @LogExecutionTime
        void drink();

        String getName();
}
