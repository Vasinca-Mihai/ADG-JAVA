package Lecture_5_generics.Genric_Iterator;

public class ArrayIterator<T> implements IArrayIterator<T>{

    /*daca cerita era sa poata itera prin mai multe generic list, atunci functioneaza asa cum este scrisa acum.
      daca trebuiea sa itereze prin elementele unui linked list pot sa importej calasa generic list si sa spun <T implements IGenericNode> apoi sa implementez o functie care sa faca
      ce face o GenericList*/
    private T[] array = null;
    private int crtIndex = 0;

    public ArrayIterator(T[] local_array) {
        this.array = local_array;
    }

    public boolean hasNext(){
            return crtIndex<array.length;
    }
    public T next(){
        return array[crtIndex++];
    }
}
