package Lecture_4_Exceptions_IO.SecretMessage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String messageLcoation ="./src/Lecture_4_Exceptions_IO/SecretMessage/message.txt";

    public static void main(String[] args) {
        List<String> words = null;
        int maxLetters = 0;
        try {
            words = getWords();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for(int i=0;i<words.size();i++){
            if(maxLetters<words.get(words.size()-1).length()){
                maxLetters = words.get(i).length();
            }
        }
        System.out.println(getSecretMessage(words,maxLetters));

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

    public static String getSecretMessage(List<String> words,int maxLetters){
        String finalMessage = new String();
        char[] characters = new char[maxLetters];
        for(int i=0;i<words.size();i++){
            characters = words.get(i).toCharArray();
            for(int j=0;j<characters.length;j++){
                if(Character.isUpperCase(characters[j])){
                    if(characters[j] == 'X'){characters[j] = ' ';}
                    finalMessage += characters[j];
                }
            }
        }

        return finalMessage;
    }
}
