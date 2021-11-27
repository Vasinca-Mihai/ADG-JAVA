package Lecture_6_collections.Bells_Triangle;

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
                triangle.get(i).add(1);
            }
            triangle.get(i).set(triangle.get(i).size()-1,1);
            //triangle.get(i).add(0,1);
            //triangle.get(i).add(triangle.get(i).size(),1);
        }
        for(int i =0;i< triangle.size();i++)
            for(int j =0 ;j<triangle.get(i).size();j++){
                if(j==0 && i>0){
                    triangle.get(i).set(0,triangle.get(i-1).get(triangle.get(i-1).size()-1));
                } else if (i>0){
                  triangle.get(i).set(j,triangle.get(i-1).get(j-1).intValue() + triangle.get(i).get(j-1).intValue());
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
