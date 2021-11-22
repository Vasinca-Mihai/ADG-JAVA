package Lecture_1.PairOf2;

public class Main {
    public static void main(String[] args) {
     int[] numbers = {2,4,-1,-2,0,-4};
     int nr_of_pairs = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0){
                nr_of_pairs++;
            }
        }
        nr_of_pairs = nr_of_pairs/3;
     for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(
                        ((numbers[i]+numbers[j])==0)&&
                        ((numbers[i]*numbers[j])!=0)
                ){
                    nr_of_pairs++;
                    numbers[i] = 0;
                    numbers[j] = 0;
                    break;
                }
            }
        }
     System.out.println(nr_of_pairs);
    }
}
