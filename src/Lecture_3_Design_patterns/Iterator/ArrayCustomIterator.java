package Lecture_3_Design_patterns.Iterator;

public class ArrayCustomIterator {
    int[] array;
    int length;
    int counter = 0;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    boolean hasNext(){
        return counter<length;
    }
    int next(){
        return array[counter++];
    }
}
