package Lecture_5_generics.Generic_Linked_List;

public class Main {
    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<String>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();

    }
}
