package Lecture_4_Exceptions_IO.NumberToLCD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLCDImplementation {// pentru redimenonarea cifrelor pot crea o clasa noua sau pot sa le modific pe astea
    public static String getDigitRow(char digit, int row){
            return digits.get(Character.getNumericValue(digit)).get(row);
    }
    private static List<List<String>> digits = new ArrayList<List<String>>(Arrays.asList(
             new ArrayList<String>(Arrays.asList(
                     " _  ",
                     "| | ",
                     "|_| ")),
             new ArrayList<String>(Arrays.asList(
                     "/|  ",
                     " |  ",
                     " |  ")),
             new ArrayList<String>(Arrays.asList(
                     "__  ",
                     "__| ",
                     "|__ ")),
             new ArrayList<String>(Arrays.asList(
                     "__  ",
                     "__| ",
                     "__| ")),
             new ArrayList<String>(Arrays.asList(
                     "| | ",
                     "|_| ",
                     "  | ")),
             new ArrayList<String>(Arrays.asList(
                     " __ ",
                     "|__ ",
                     "__| ")),
             new ArrayList<String>(Arrays.asList(
                     " __ ",
                     "|__ ",
                     "|_| ")),
             new ArrayList<String>(Arrays.asList(
                     "___ ",
                     "  | ",
                     "  | ")),
             new ArrayList<String>(Arrays.asList(
                     " __ ",
                     "|_| ",
                     "|_| ")),
             new ArrayList<String>(Arrays.asList(
                     " __ ",
                     "|_| ",
                     "  | "))
             ));
}


