package Lecture_6_collections.MyArrayList;

public interface MyArrayList<T> {
    void add(T e);
    void remove(T e);
    T get(int index);
    void set(int index, T e);
    int size();
}
