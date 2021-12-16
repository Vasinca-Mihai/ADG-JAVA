package Project.Proxy;

import java.util.HashMap;

public class Database {
    private HashMap<String, Person> DB = new HashMap<>();

    public void addEntry(Person p){
        DB.put(p.getCNP(),p);
    }
    public void removeEntry(String CNP){
        DB.remove(CNP);
    }
    public Person getData(String CNP){
        return DB.get(CNP);
    }
}
