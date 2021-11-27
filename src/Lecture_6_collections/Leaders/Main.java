package Lecture_6_collections.Leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void findLeaders(ArrayList<Integer> numbers) {
        int max = numbers.get(numbers.size()-1);
        System.out.println(max);
        for(int i=numbers.size()-2;i>=0;i--){
            if(max<numbers.get(i)){
                max = numbers.get(i);
                System.out.println(max);
            }
        }
    }
    public static void findLeaders2(ArrayList<Integer> numbers) {
        Collections.reverse(numbers);
        int max = numbers.get(0);
        System.out.println(max);
        for(Integer crtelemnt : numbers){
            if(max<crtelemnt){
                max = crtelemnt;
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(11,5,3,1,2));//research this
        findLeaders(numbersList);
        System.out.println();
        findLeaders2(numbersList);
    }
}
