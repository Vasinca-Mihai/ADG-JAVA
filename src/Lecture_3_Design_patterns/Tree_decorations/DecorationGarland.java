package Lecture_3_Design_patterns.Tree_decorations;

public class DecorationGarland extends Decoration {
    public DecorationGarland(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    public String getDecoration() {
        return "G";
    }
}