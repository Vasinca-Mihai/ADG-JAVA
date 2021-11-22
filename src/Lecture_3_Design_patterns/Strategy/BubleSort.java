package Lecture_3_Design_patterns.Strategy;

public class BubleSort implements SortingStrategy {

    public void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i]>(list[j])) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
