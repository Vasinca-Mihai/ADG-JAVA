package Lecture_8_Functional.Lambda_chalange;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Ch3 {
    public List<String> getUpperCase (List<String> words){
        return words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

}
