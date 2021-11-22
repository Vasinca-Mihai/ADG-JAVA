package Lecture_3_Design_patterns.Tree_decorations;

public class DecorationBulb extends Decoration {
    public DecorationBulb(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    public String getDecoration() {
        return "B";
    }
}
