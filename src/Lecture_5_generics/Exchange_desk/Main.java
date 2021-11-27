package Lecture_5_generics.Exchange_desk;

public class Main {
    public static void main(String[] args) {
        RON account1 = new RON(200);
        USD account2 = new USD(200);
        RON.setAbsRate(1);
        USD.setAbsRate(4);
        System.out.println(account1);
        System.out.println(account2);
        try{
            account2.setCrtAmount(account2.getCrtAmount()+ExchangeDesk.convertFT(account1,account2,20));
        }catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
        System.out.println(account1);
        System.out.println(account2);
    }
}
