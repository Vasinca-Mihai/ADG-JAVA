package Lecture_7_concurrency.bank_transaction;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount from = new BankAccount("Source",1000);
        BankAccount to = new BankAccount("Destination",800);

        System.out.println(from);
        System.out.println(to);

        TransactionThread t1 = new TransactionThread("Transaction 1",from,to,400);
        TransactionThread t2 = new TransactionThread("Transaction 2",to,from,400);
        t1.start();
        t2.start();


        t1.join();
        t2.join();
        //System.out.println(from);
        //System.out.println(to);
    }
}
