package Lecture_3_Design_patterns.Visitors;

public interface Visitor {

    void visit(Book book);

    void visit(Video video);

    void visit(Audio audio);
}
