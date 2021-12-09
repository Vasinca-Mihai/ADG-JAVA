package Lecture_8_Functional.Streams;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static long ex1(List<String> strings){
        long count = strings.stream()
                .flatMap(line -> {
                    return Stream.of(line.split(" "));
                }).count();

        return count;
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList("My syting 1", "just one"));
        System.out.println(ex1(strings));

    }
}
