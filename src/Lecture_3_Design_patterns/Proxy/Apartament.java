package Lecture_3_Design_patterns.Proxy;

public class Apartament {
    private final String location;
    private final int monthlyRentCost;

    public Apartament(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public String toString(){
        return "Apartament{location=\""+location+"\", monthlyRentCost="+monthlyRentCost+"}";
    }
}
