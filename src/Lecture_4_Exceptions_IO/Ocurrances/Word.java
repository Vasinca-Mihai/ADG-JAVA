package Lecture_4_Exceptions_IO.Ocurrances;

import java.security.PrivateKey;

public class Word implements Comparable<Word>{
    private String word;
    private int nrOfOccurances = 1;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getNrOfOccurances() {
        return nrOfOccurances;
    }
    public void incrementNrOfOccurances(){
        nrOfOccurances++;
    }

    public String toString(){
        return this.word +" / "+nrOfOccurances;
    }

    public int compareTo(Word word){
        if(this.nrOfOccurances> word.nrOfOccurances){return -1;}
        else if(this.nrOfOccurances< word.nrOfOccurances){return 1;}
        else {
            return this.word.compareTo(word.word);
        }
    }
}
