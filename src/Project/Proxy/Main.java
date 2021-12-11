package Project.Proxy;

public class Main {
    public static void main(String[] args) {
        String n = "5021123460028";
        DatabaseProxy DBP = new DatabaseProxy();
        DBP.addEntry(new Person("Vasinca Mihai-Laurentiu","5021123460028","Jud. If, Com ..........."));
        DBP.addEntry(new Person("Nilofar Grozda","2940829179393","Bucuresti, Sector 6, strada ghirlandei......"));
        DBP.addEntry(new Person("Zinedine Monika","1881124023929","Bucuresti, sector 2, stradapancota,....."));
        DBP.addEntry(new Person("Imram Blanka","1950720469398","Jud Alba, strada Theodor aman,......"));
        Person p = DBP.getData(n);
        System.out.println(p);
        DBP.removeEntry(p.getCNP());
        System.out.println(DBP.getData(p.getCNP()));
    }
}
