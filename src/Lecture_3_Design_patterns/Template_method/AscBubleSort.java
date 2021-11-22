package Lecture_3_Design_patterns.Template_method;

public class AscBubleSort extends BubbleSortTemplate{
    public boolean checkCorrectOrder(int i1, int i2){
        return i2<i1;
    }
}
