package Lecture_7_concurrency.bank_transaction;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int ammount;
    public TransactionThread(String name, BankAccount from,BankAccount to, int amount){
        this.name = name;
        this.ammount = amount;
        this.to = to;
        this.from = from;
    }

    @Override
    public void run(){
        transfer();
    }

    private void transfer(){
        try{
            from.withdraw(ammount);
            to.depozit(ammount);
            System.out.println("Transfer "+ name+" was executed.");
            System.out.println("From: "+from);
            System.out.println("To: "+to);
        }
        catch (InsufficientFoundsException e){
            System.out.println(e.getMessage() + "in " + this.name);
        }
    }

}
