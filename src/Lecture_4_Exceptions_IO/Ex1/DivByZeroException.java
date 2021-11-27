package Lecture_4_Exceptions_IO.Ex1;

public class DivByZeroException extends RuntimeException{
    public  DivByZeroException(){super("Can't calculate salary for zero hours.");}
}
