package Lecture_3_Design_patterns.Strategy;
import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    public void sort(int[] large_list) {
        if (large_list.length <= 1) {
            return;
        }
        int mid = large_list.length / 2;
        int[] left_list = Arrays.copyOfRange(large_list, 0, mid);
        int[] right_list = Arrays.copyOfRange(large_list, mid, large_list.length);

        sort(left_list);
        sort(right_list);
        merge(left_list, right_list, large_list);
    }

    private void merge(int[] left_list, int[] right_list, int[] large_list) {
        int left_counter = 0;
        int righ_tcounter = 0;
        int large_listcounter = 0;

        while (left_counter < left_list.length && righ_tcounter < right_list.length) {
            if ((left_list[left_counter]-(right_list[righ_tcounter])) < 0) {
                large_list[large_listcounter++] = left_list[left_counter++];
            } else {
                large_list[large_listcounter++] = right_list[righ_tcounter++];
            }
        }
        while (left_counter < left_list.length) {
            large_list[large_listcounter++] = left_list[left_counter++];
        }
        while (righ_tcounter < right_list.length) {
            large_list[large_listcounter++] = right_list[righ_tcounter++];
        }
    }
}