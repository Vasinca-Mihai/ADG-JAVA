package Lecture_6_collections.MyArrayList;

public class MyArrayListImpelementation<T> implements MyArrayList<T>{
    Object [] array = new Object[0];
    int size = 0;
    public void add(T e){
        Object[] temporaryArray = new Object[size+1];
        for(int i=0;i<array.length;i++){
            temporaryArray[i] = array[i];
        }
        temporaryArray[temporaryArray.length-1] = e;
        array = temporaryArray;
        size++;
    }
    public void remove(T e){
        Object[] temporaryArray = new Object[size-1];
        int flag = 0;
        for(int i=0;i<array.length-1;i++){
            if(array[i] != null)flag = 1;
            temporaryArray[i] = array[i+1*flag];
        }
        array = temporaryArray;
        size--;
    }
    public T get(int index){ return (T) array[index];}
    public void set(int index, T e){
        if(index<size){
            array[index] = e;
        }else {throw new ArrayIndexOutOfBoundsException();}
    }
    public int size(){return size;}
}
