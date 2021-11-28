package Lecture_6_collections.MySet;

public class Main {
    public static void main(String[] args) {
        MySet set = new MySetImplementation();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.remove(1);
        set.add(1);

        for(int i=0; i< set.size();i++){
            System.out.println(set.get(i));
        }
    }
}
