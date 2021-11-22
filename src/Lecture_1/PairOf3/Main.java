package Lecture_1.PairOf3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,0,0,-2,0,1,5,-6,6,-3};
        int nr_of_pairs = 0;
        int stray_zeros = 0;
        nr_of_pairs += getPairsOfZeros(numbers);
        stray_zeros += getStrayZeros(numbers);
        nr_of_pairs += getPairsOfThree(numbers);
        nr_of_pairs += clamp(getPairsOfTwo(numbers),0,stray_zeros);
        System.out.println(nr_of_pairs);
    }
    public static int getPairsOfZeros(int[] numbers){
        int zeros = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0){
                zeros++;
            }
        }
        return zeros % 3;
    }
    public static int getStrayZeros(int[] numbers){
        int zeros = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0){
                zeros++;
            }
        }
        return zeros / 3;
    }

    public static int getPairsOfThree (int[] numbers) {
        int nr_of_pairs = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                for(int z=0;z<numbers.length;z++){
                    if(
                            ((numbers[i]+numbers[j]+numbers[z])==0)&&
                                    ((numbers[i]*numbers[j]*numbers[z])!=0)
                    ){
                        nr_of_pairs++;
                        numbers[i] = 0;
                        numbers[j] = 0;
                        numbers[z] = 0;
                        break;
                    }
                }
            }
        }
        return nr_of_pairs;
    }


    public static int getPairsOfTwo (int[] numbers){
        int nr_of_pairs = 0;
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
        return nr_of_pairs;
    }

    public static int clamp(int nr,int min, int max){
        if(nr>max){nr=max;}
        if(nr<min){nr=min;}
        return nr;
    }
}
