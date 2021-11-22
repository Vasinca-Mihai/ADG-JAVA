package Lecture_4_Exceptions_IO.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void storeCOntactToFIle(String fileName, Contact contact) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter!=null) bufferedWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/Lecture_4_Exceptions_IO/IO/contacts.txt");
        //System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));
        storeCOntactToFIle("./src/Lecture_4_Exceptions_IO/IO/foundContacts.txt", phoneBook.findContact("Abbey"));
    }
}
