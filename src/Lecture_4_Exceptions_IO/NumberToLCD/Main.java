package Lecture_4_Exceptions_IO.NumberToLCD;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static String inPath = "./src/Lecture_4_Exceptions_IO/NumberToLcd/InputFile.txt";
    public static String outPath = "./src/Lecture_4_Exceptions_IO/NumberToLcd/outputFile.txt";
    public static void main(String[] args) {
        List<String> numbersLCD = new ArrayList<String>();
        String numbers = null;
        int height = 3;
        height--;
        numbers = getNumber();
        try{
            putNumber(numbersLCD);
        }catch (IOException e){e.printStackTrace();}

        for(int i = 0;i<=height;i++){
            numbersLCD.add("");
            for (int j=0;j<numbers.length();j++){
                numbersLCD.set(i,numbersLCD.get(i) + NumberLCDImplementation.getDigitRow(numbers.toCharArray()[j],i));
            }
        }

        try {
            putNumber(numbersLCD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getNumber(){
        String number = null;
        Scanner s = null;
        try {
            s = new Scanner(new BufferedInputStream(new FileInputStream(inPath)));
        }catch (FileNotFoundException e){e.printStackTrace();}
        if(s.hasNext()){
            number = s.nextLine();
        }
        s.close();
        return number;
    }

    public static void putNumber(List<String> numbersLCD) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath));
        for(int i=0;i<numbersLCD.size();i++){
            System.out.println(numbersLCD.get(i));
            bufferedWriter.write(numbersLCD.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
