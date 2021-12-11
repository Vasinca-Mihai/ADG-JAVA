package Project.Proxy;

public class Person {
    private String name;
    private String CNP;
    private String adress;

    public Person(String name, String CNP, String adress) {
        this.name = name;
        this.CNP = CNP;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", CNP='" + CNP + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
