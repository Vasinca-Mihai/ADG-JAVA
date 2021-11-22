package Lecture_3_Design_patterns.Visitors;

public class TimeVisitor implements Visitor{
    private int time;
    public void visit(Book book){
        time +=book.getNumberOfPages()*4;
    }
    public void visit(Video video){
        time +=video.getTime();
    }
    public void visit(Audio audio){
        time+=audio.getTime();
    }
    public String toString(){
        return "total time is: "+time;
    }
}
