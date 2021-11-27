package Lecture_5_generics.Generic_Binary_Search;

public class Main<T> {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{9,8,7,6,5,4,3,2,1};
        int pos = 0;
        try {
            pos = binarySearch(array,0,array.length-1,7, array[0].intValue() < array[array.length-1].intValue());
        } catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }
        System.out.println(pos);
    }

    public static<T extends Comparable> int binarySearch(T arr[], int l, int r, T searchFor, boolean isAscending) throws ArrayNotSortedException{
        if (r >= l) {
            int multiplier = isAscending ? 1 : -1 ;
            int mid = l + (r - l) / 2;
            if (arr[mid].compareTo(searchFor)==0)
                return mid;
            if (arr[mid].compareTo(searchFor)*multiplier>0){
                return binarySearch(arr, l, mid - 1, searchFor, isAscending);}
            else {
                return binarySearch(arr, mid + 1, r, searchFor, isAscending);
            }
        }
        throw new ArrayNotSortedException();
    }
}
