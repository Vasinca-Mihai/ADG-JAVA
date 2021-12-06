package Lecture_8_Functional.Ex1;

public class Student {
    private String name;
    private int gradYear;
    private int score;

    public Student(String name, int gradYear, int score) {
        this.name = name;
        this.gradYear = gradYear;
        this.score = score;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", score=" + score +
                '}';
    }
}
