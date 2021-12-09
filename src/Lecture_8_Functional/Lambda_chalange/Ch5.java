package Lecture_8_Functional.Lambda_chalange;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Ch5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        new Thread( () -> list.forEach(System.out::println)).start();
    }

}

