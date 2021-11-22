package Lecture_3_Design_patterns.Tree_decorations;

public class Main {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();

        DecorableTree decoratedTree = christmasTree;
        decoratedTree = new DecorationCandy(2, decoratedTree);
        decoratedTree = new DecorationBulb(6, decoratedTree);
        decoratedTree = new DecorationGarland(7, decoratedTree);

        decoratedTree.display();
        christmasTree.display();
    }
}
