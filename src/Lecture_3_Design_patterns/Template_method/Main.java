package Lecture_3_Design_patterns.Template_method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        int[] arr2 = new int[]{1, 4, 5, 2, 3, 6, 9, 8, 7};

        AscBubleSort asc = new AscBubleSort();
        asc.sort(arr1);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(arr2);

        printSorted(arr1);
        printSorted(arr2);
    }

    public static void printSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
