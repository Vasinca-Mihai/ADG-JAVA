package Lecture_3_Design_patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,5,6,7,8,4,9,10};
        int[] array2 = new int[]{10,2,8,5,7,6,3,4,9,1};
        BubleSort bs = new BubleSort();
        MergeSort ms = new MergeSort();
        bs.sort(array1);
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("");
        ms.sort(array2);
        for(int i = 0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
