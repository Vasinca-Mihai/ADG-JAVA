package Lecture_9_Reactive.CodeChallenge;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    public static void main(String[] args) {
        displayingLetters();
        findMissingLetter();
        restoringMissingLetter();
    }

    public static void displayingLetters(){
        Flux<String> f = Flux.fromIterable(words).flatMap(s-> Flux.fromArray(s.split("")))
                .zipWith(Flux.range(1,Integer.MAX_VALUE),(str,count) -> String.format("%d. %s",count,str));
        f.subscribe(System.out::println);
    }

    public static void findMissingLetter(){
        Flux<String> f = Flux.fromIterable(words).flatMap(s-> Flux.fromArray(s.split("")))
                .distinct()
                .sort().zipWith(Flux.range(1,Integer.MAX_VALUE),(str,count) -> String.format("%d. %s",count,str));
        f.subscribe(System.out::println);
    }

    public static void restoringMissingLetter(){
        Mono<String> m = Mono.just("s");
        Flux<String> f = Flux.fromIterable(words).flatMap(s->Flux.fromArray(s.split("")))
                .concatWith(m).distinct().sort()
                .sort().zipWith(Flux.range(1,Integer.MAX_VALUE),(str,count) -> String.format("%d. %s",count,str));
        f.subscribe(System.out::println);

    }

}
