package Lecture_3_Design_patterns.Visitors;

public class Book implements Element {
    private String name;
    private int numberOfPages;
    private String autor;
    private int price;

    public Book(String name, int numberOfPages, int price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String toString(){
        return name+", "+numberOfPages+" pages, written by "+autor+", price:"+price;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
