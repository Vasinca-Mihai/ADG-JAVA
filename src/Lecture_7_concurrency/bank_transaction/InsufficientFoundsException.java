package Lecture_7_concurrency.bank_transaction;

public class InsufficientFoundsException extends Exception{
    public InsufficientFoundsException(){
        super("The provided amount exceeds the debit of your account.");
    }
}
