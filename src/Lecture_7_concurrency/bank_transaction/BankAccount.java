package Lecture_7_concurrency.bank_transaction;

public class BankAccount {
    private String name;
    private int debit;
    public BankAccount(String name, int debit){
        this.name = name;
        this.debit = debit;
    }

    synchronized public void withdraw(double amount) throws InsufficientFoundsException{
        if(amount > debit){
        throw new InsufficientFoundsException();
        }
        LongDatabaseCall();
        this.debit -= amount;
    }
    synchronized public void depozit(double amount){
        this.debit += amount;
    }

    public void LongDatabaseCall(){
        try{Thread.sleep(1000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Override
    public String toString(){
        return "Bank account named: "+this.name+" has the following debit "+this.debit;
    }

}
