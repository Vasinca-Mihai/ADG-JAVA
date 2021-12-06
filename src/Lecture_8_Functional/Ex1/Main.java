package Lecture_8_Functional.Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    static int getTopStudent(List<Student> stundets){
        Optional o=stundets.stream()
                .filter((Student s) -> s.getGradYear() == 2011)
                .map((Student s) -> s.getScore())
                .max(Integer::compareTo);
        return (Integer) o.get();
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList((new Student("S1",2011,9)),
                (new Student("S2",2011,8)),
                (new Student("S3",2012,10)));

        System.out.println(getTopStudent(students));
    }
}
