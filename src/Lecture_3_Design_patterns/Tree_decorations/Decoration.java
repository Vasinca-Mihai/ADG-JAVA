package Lecture_3_Design_patterns.Tree_decorations;

import jdk.jshell.execution.JdiExecutionControl;

import java.util.List;
import java.util.ArrayList;

public abstract class Decoration implements DecorableTree{
    protected int rowInTree;
    protected DecorableTree tree;

    public Decoration(int rowInTree, DecorableTree tree) {
        this.rowInTree = rowInTree;
        this.tree = tree;
    }

    public List<List<String>> getTree (){
        int rowStart,rowEnd;
        List<List<String>> tree_str = new ArrayList<>(tree.getTree());
        List<String> decoratedRow = new ArrayList<>(tree.getTree().get(rowInTree));
        rowStart = tree_str.get(rowInTree).indexOf("<");
        rowEnd = tree_str.get(rowInTree).indexOf(">");
        for(int i=rowStart+1;i<rowEnd;i++ ){
            decoratedRow.set(i,getDecoration());
        }
        tree_str.set(rowInTree,decoratedRow);
        return tree_str;
    }


    abstract String getDecoration();

    public void display() {
        List<List<String>> localTree = this.getTree();
        for (int i = 0; i < localTree.size(); i++) {
            for (int j = 0; j < localTree.get(i).size(); j++) {
                System.out.print(localTree.get(i).get(j));
            }
            System.out.println();
        }
    }

}
