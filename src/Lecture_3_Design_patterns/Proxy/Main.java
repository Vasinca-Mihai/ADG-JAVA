package Lecture_3_Design_patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Apartament app01 = new Apartament("Crangasi01", 300);
        Apartament app02 = new Apartament("Crangasi01", 600);
        Apartament app03 = new Apartament("Crangasi01", 350);
        Apartament app04 = new Apartament("Crangasi01", 400);
        Apartament app05 = new Apartament("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.reprezent(app01);
        proxy.reprezent(app02);
        proxy.reprezent(app03);
        proxy.reprezent(app04);
        proxy.reprezent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartament apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartament apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

    }
}
