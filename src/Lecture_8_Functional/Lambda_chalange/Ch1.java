package Lecture_8_Functional.Lambda_chalange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Ch1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(Arrays.asList("primul cuvant","duv","lol","uwu"));
        System.out.println(getFirstLettersBig(words));
    }

    public static String getFirstLettersBig(List<String> words){
        return words.stream()
                .map(s -> s.toUpperCase())
                .map(s -> s.charAt(0))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
