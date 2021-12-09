package Lecture_8_Functional.Lambda_chalange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ch2 {
    public static List<String> removeOdd(List<String> words){

        return words
                .stream()
                .filter(s->s.length()%2==0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> res = removeOdd(Arrays.asList("abs","cder","u","1234"));
        System.out.println(res);
    }

}
