package Lecture_4_Exceptions_IO.Ex1;

public class FewHoursException extends Exception{
    public FewHoursException(){
        super("Not enough hours exception");
    }
}
