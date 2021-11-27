package Lecture_4_Exceptions_IO.Ocurrances;

import java.io.*;
import java.util.*;

public class Main {
    public static String inPath = "./src/Lecture_4_Exceptions_IO/Ocurrances/InputFile.txt";

    public static void main(String[] args) {
        List<Word> words = new ArrayList<Word>();
        try {
            words = getWords();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(words);
        for(int i =0;i<words.size() && i< 10 ;i++){
            System.out.println(words.get(i));
        }
    }

    public static List<Word> getWords() throws IOException{
        List<Word> words = new ArrayList<Word>();
        String crtWord = null;
        Scanner s = new Scanner(new BufferedInputStream(new FileInputStream(inPath)));
        boolean hasFound = false;
        while(s.hasNext()){

            crtWord = s.next();
            crtWord = cleanWordString(crtWord);

            for(int i =0;i<words.size();i++){
                if(words.get(i).getWord().compareTo(crtWord) == 0){
                    words.get(i).incrementNrOfOccurances();
                    hasFound = true;
                }
            }
            if(!hasFound){
                words.add(new Word(crtWord));
            }
            hasFound = false;
        }
        s.close();
        return words;
    }

    public static String cleanWordString(String word){
        word = word.toLowerCase();
        word = word.replaceAll("\\p{Punct}", "");

        return word;
    }

}
