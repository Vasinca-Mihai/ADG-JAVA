package Lecture_5_generics.Generic_Binary_Search;

public class ArrayNotSortedException extends Exception{
    public ArrayNotSortedException(){
        super("The given array is not sorted.");
    }
}
