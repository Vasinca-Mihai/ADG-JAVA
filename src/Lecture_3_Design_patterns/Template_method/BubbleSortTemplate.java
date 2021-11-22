package Lecture_3_Design_patterns.Template_method;

public abstract class BubbleSortTemplate {

    public void sort(int[] numere) {
        for (int i = 0; i < numere.length - 1; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (checkCorrectOrder(numere[i], numere[j])) {
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j] = temp;
                }
            }
        }
    }

    public abstract boolean checkCorrectOrder(int i1, int i2);
}
