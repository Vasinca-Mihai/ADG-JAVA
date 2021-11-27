package Lecture_5_generics.Generic_Linked_List;

public class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private IGenericNode<T> next;

    public T getValue(){
        return this.value;
    }
    public void setValue(T element){
        this.value = element;
    }
    public IGenericNode<T> getNext(){
        return this.next;
    }
    public void setNext(IGenericNode<T> next){
        this.next = next;
    }
}
