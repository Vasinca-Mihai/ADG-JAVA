package Lecture_9_Reactive.CodeChallenge;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Challange1 {
    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        fooBarFlux().subscribe(System.out::println);
        //errorFlux().subscribe(System.out::println);
    }
    public static Flux<String> emptyFlux(){
        return Flux.empty();
    }
    public static Flux<String> fooBarFlux(){
        return Flux.just("Foo","Bar");
    }
    public static Flux<String> errorFlux(){
        return Flux.error(new IllegalStateException());
    }
    public static Flux<Long> counter(){
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }
}
