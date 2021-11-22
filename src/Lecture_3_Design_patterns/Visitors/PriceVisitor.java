package Lecture_3_Design_patterns.Visitors;

public class PriceVisitor implements Visitor{
    private int price;

    public void visit(Book book){
        price +=book.getPrice();
    }
    public void visit(Video video){
        price +=video.getPrice();
    }
    public void visit(Audio audio){
        price+=audio.getPrice();
    }

    public String toString(){
        return "total price is: "+price;
    }
}
