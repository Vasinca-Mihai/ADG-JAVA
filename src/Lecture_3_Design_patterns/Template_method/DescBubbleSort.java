package Lecture_3_Design_patterns.Template_method;

public class DescBubbleSort extends BubbleSortTemplate{
    public boolean checkCorrectOrder(int i1, int i2){
        return i1<i2;
    }
}
