package Lecture_9_Reactive.CodeChallenge;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Challenge5 {

    private static List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    private static List<String> words2 = Arrays.asList(
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
        long sleepTime = 1000;
        Flux<String> f1 = Flux.fromIterable(words1).delayElements(Duration.ofMillis(100L));
        Flux<String> f2 = Flux.fromIterable(words2).delayElements(Duration.ofMillis(101L));
        System.out.println("\n\tmerge with interleave");
        mergeFluxWithInterleave(f1,f2).subscribe(System.out::println);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\tmerge with no interleave");
        mergeFluxWithNoInterleave(Flux.fromIterable(words1),Flux.fromIterable(words2)).subscribe(System.out::println);
        System.out.println("\n\tMerge two mono in a flux");
        createFluxFromMultipleMono(Mono.just(words1.get(0)),Mono.just(words2.get(0))).subscribe(System.out::println);
    }
    static Flux<String> mergeFluxWithInterleave(Flux<String> flux1,Flux<String> flux2){
        return flux1.mergeWith(flux2);
    }
    static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1,Flux<String> flux2){
        return flux1.concatWith(flux2);
    }
    static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }
}
