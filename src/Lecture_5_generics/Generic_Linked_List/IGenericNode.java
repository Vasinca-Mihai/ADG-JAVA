package Lecture_5_generics.Generic_Linked_List;

public interface IGenericNode<T> {
    T getValue();
    void setValue(T element);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
