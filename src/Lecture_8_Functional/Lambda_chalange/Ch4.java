package Lecture_8_Functional.Lambda_chalange;

import java.util.*;
import java.util.stream.Collectors;

public class Ch4 {

    public static String getStringOutOfMap(Set<Map.Entry<Integer, Character>> set){
        return set
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList())
                .toString();
    }

    public static void main(String[] args) {
        Map<Integer,Character> map = new HashMap<>();
        map.put(4,'4');
        map.put(5,'5');
        map.put(6,'6');
        map.put(7,'7');
        Set<Map.Entry<Integer, Character>> set = map.entrySet();
        System.out.println(getStringOutOfMap(set));
    }
}
