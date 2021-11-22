package Lecture_4_Exceptions_IO.IO;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String toString(){
        return "Phone number of "+name+" is "+phoneNumber+ "\n";
    }

    public String getName() {
        return name;
    }
}
