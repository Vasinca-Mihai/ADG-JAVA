package Lecture_4_Exceptions_IO.Anagram;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String messageLcoation="./src/Lecture_4_Exceptions_IO/Anagram/words.txt";
    public static final String outputFlie="./src/Lecture_4_Exceptions_IO/Anagram/out.txt";
    public static List<List<String>> outputList = new ArrayList<List<String>>();
    public static void main(String[] args){
        List<String> words = new ArrayList<String>();
        try {
            words = getWords();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for(int i=0;i<words.size();i++){
            outputList.add(new ArrayList<String>());
            anagm(words.get(i), 0, i);
        }
        try {
            outputResults();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void anagm(String str, int start, int nrOfWord){
        int end = str.length()-1;
        if (start == end){
            outputList.get(nrOfWord).add(str);
        }

        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                anagm(str, start + 1, nrOfWord);
                str = swap(str, start, i);
            }
        }
    }
    public static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static List<String> getWords() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(messageLcoation)));
            while (s.hasNext()){
                words.add(s.next());
            }
        }finally {
            if(s!=null){s.close();}
        }
        return words;
    }
    public static void outputResults() throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFlie));
        for(int i=0;i<outputList.size();i++){
            for(int j=0;j<outputList.get(i).size();j++){
                bufferedWriter.write(outputList.get(i).get(j));//something is wrong with this
                bufferedWriter.write(" ");
                System.out.println("x"+i+" y"+j+ " " + outputList.get(i).get(j)+'\n');
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
