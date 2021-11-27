package Lecture_6_collections.Zig_Zag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(4,3,7,8,6,2,1));
        boolean flag = true;

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1) && flag){
                Collections.swap(list,i,i+1);
            }else if (list.get(i)<list.get(i+1) && !flag){
                Collections.swap(list,i+1,i);
            }
            flag = !flag;
        }
        System.out.println(list);
    }


}
