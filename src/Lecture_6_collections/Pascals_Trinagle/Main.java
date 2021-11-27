package Lecture_6_collections.Pascals_Trinagle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> triangle= new ArrayList<>();
        for(int i = 0;i < 5 ;i++){
            //i means row 0 based
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            while (triangle.get(i).size()<i+1){
                triangle.get(i).add(0);
            }
            triangle.get(i).set(triangle.get(i).size()-1,1);
            //triangle.get(i).add(0,1);
            //triangle.get(i).add(triangle.get(i).size(),1);
            }
            for(int i =0;i< triangle.size();i++)
        for(int j =1;j<triangle.get(i).size();j++){
            while (triangle.get(i).get(j) == 0){
                triangle.get(i).set(j,triangle.get(i-1).get(j-1).intValue()+triangle.get(i-1).get(j).intValue());
            }
        }
        for(int i=0;i< triangle.size();i++){
            for(int j=0; j<triangle.get(i).size();j++){
                System.out.print(" "+triangle.get(i).get(j));
            }
            System.out.println();
        }
    }
}
