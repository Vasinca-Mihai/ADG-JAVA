package Lecture_5_generics.Generic_Linked_List;

public class GenericList <T> implements IGenericList<T>{
    private GenericNode<T> root;

    public GenericList(T root_value) {
        this.root = new GenericNode<>();
        this.root.setValue(root_value);
    }

    public void insert(T element) {
        IGenericNode<T> crtNode = this.root;
        while (crtNode.getNext() != null) {
            crtNode = crtNode.getNext();
        }

        IGenericNode<T> newNode = new GenericNode();
        newNode.setValue(element);
        crtNode.setNext(newNode);
    }

    public void println(){
        IGenericNode<T> crtNode = root;
        if(crtNode != null){
            System.out.print(crtNode.getValue());
            while(crtNode.getNext()!=null){
                crtNode = crtNode.getNext();
                System.out.print(crtNode.getValue());
            }
        }

    }
}
