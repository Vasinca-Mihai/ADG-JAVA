package Lecture_9_Reactive.CodeChallenge.Challenge4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<User> l = new ArrayList<>(Arrays.asList(
            new User("name1","name2","user1"),
            new User("name3","name4","user2"),
            new User("name5","name6","user3"),
            new User("name7","name8","user4"),
            new User("name9","name10","user5")
    ));

    public static void main(String[] args) {
        capitalizeOne(Mono.just(l.get(0))).subscribe(System.out::println);
        System.out.println('\n');
        capitalizeMany(Flux.fromIterable(l)).subscribe(System.out::println);
        System.out.println('\n');
        asyncCapitalizeMany(Flux.fromIterable(l)).subscribe(System.out::println);
    }

    public static Mono<User> capitalizeOne(Mono<User> m){
        return m.map(u->new User(u.getFirstName().toUpperCase(),u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }
    public static Flux<User> capitalizeMany(Flux<User> f){
        return f.map(u->new User(u.getFirstName().toUpperCase(),u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }
    public static Flux<User> asyncCapitalizeMany(Flux<User> f){
        return f.flatMap(u->asyncCapitalizeUser(u).flux());
    }
    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(u.getFirstName().toUpperCase(), u.getLastName().toUpperCase(), u.getUsername().toUpperCase()));
    }
}
