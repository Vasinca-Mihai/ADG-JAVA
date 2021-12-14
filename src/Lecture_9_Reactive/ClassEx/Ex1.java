package Lecture_9_Reactive.ClassEx;

import reactor.core.publisher.Flux;

import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        int factor=2;
        IntStream s = IntStream.range(1,1000)
                .map(e-> e*factor).filter(e -> e>5);
        int first = s.findFirst().getAsInt();
        System.out.println(first);
    }
}
