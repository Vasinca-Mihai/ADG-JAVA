package Lecture_3_Design_patterns.Tree_decorations;

public class DecorationCandy extends Decoration {
    public DecorationCandy(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    public String getDecoration() {
        return "C";
    }
}
