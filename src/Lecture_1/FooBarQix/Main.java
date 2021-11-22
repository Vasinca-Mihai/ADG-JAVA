package Lecture_1.FooBarQix;

public class Main {
    public static void main(String[] args) {
        String rezult;
        int nr = 305;
        rezult = Compute(nr, false);
        System.out.println(nr + " => " + rezult);
        rezult = Compute2(nr, false);
        System.out.println(nr + " => " + rezult);
    }

    public static String Compute (int number, boolean recall){
        String output = "";
        String numbers = String.valueOf(number);
        if((number % 3) == 0 ){ output = output + "Foo";}
        if((number % 5) == 0 ){ output = output + "Bar";}
        if((number % 7) == 0 ){ output = output + "Qix";}
        if (!recall) {
            char a;
            for (int i = 0; i<numbers.length();i++) {
                a = numbers.charAt(i);
                if(a!='0'){output = output + Compute(Character.getNumericValue(a), true);}
            }
        }
        return output;
    }
    public static String Compute2 (int number, boolean recall){
        String output = "";
        String numbers = String.valueOf(number);
        if((number % 3) == 0 ){ output = output + "Foo";}
        if((number % 5) == 0 ){ output = output + "Bar";}
        if((number % 7) == 0 ){ output = output + "Qix";}
        if (!recall) {
            char a;
            for (int i = 0; i<numbers.length();i++) {
                a = numbers.charAt(i);
                if(a == '0'){output = output + "*";}
                else{output = output + Compute(Character.getNumericValue(a), true);}

            }
        }
        return output;
    }
}

