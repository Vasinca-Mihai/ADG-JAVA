package Lecture_6_collections.Set;

import java.util.*;

public class Main {

    public static void createSet(){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,6,7));
        Collection<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }
    public static Map createMap(){
        Map newMap = new HashMap();
        newMap.put(1,"one");
        newMap.put(5,"five");
        newMap.put(7,"seven");
        newMap.put(5,"fiveeee");
        newMap.put(9,"seven");
        System.out.println(newMap);

        return newMap;
    }

    public static void main(String[] args) {
        createSet();
        Map<Integer,String> newMap = createMap();
        for(Map.Entry<Integer,String> entry : newMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
