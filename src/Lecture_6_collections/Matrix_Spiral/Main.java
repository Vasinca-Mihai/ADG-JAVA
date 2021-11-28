package Lecture_6_collections.Matrix_Spiral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>(Arrays.asList(
                new ArrayList<Integer>(Arrays.asList(1 , 2 , 3 , 4)),
                new ArrayList<Integer>(Arrays.asList(12, 13, 14, 5)),
                new ArrayList<Integer>(Arrays.asList(11, 16, 15, 6)),
                new ArrayList<Integer>(Arrays.asList(10, 9 , 8 , 7))
        ));
        spiralThrough(matrix);
        }

    public static void spiralThrough (List<List<Integer>> matrix){
        String output = "";
        while(matrix != null){
            for(int i = 0;i<matrix.size();i++){
                output += matrix.get(0).get(i) + ", ";
            }
            for(int i = 1;i<matrix.size();i++){
                output += matrix.get(i).get(matrix.get(i).size()-1) + ", ";
            }
            for(int i = matrix.get(matrix.size()-1).size()-2;i>=0;i--){
                output += matrix.get(matrix.size()-1).get(i) + ", ";
            }
            for(int i = matrix.size()-2;i>=1;i--){
                output += matrix.get(i).get(0) + ", ";
            }
            if(matrix.size() <=2 || matrix.get(1).size() <=2) break;
            matrix = removeBorders(matrix);
        }
        System.out.println(output);
    }

    public static List<List<Integer>> removeBorders(List<List<Integer>> matrix){
        matrix.remove(0);
        matrix.remove(matrix.size()-1);
        matrix.get(matrix.size()-1).remove(0);
        matrix.get(matrix.size()-1).remove(matrix.get(matrix.size()-1).size()-1);
        matrix.get(0).remove(0);
        matrix.get(0).remove(matrix.get(0).size()-1);
        return matrix;
    }
}
