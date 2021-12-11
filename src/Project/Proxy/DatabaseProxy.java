package Project.Proxy;

public class DatabaseProxy {
    private Database MainDatabase;
    public DatabaseProxy(){
        this.MainDatabase = Database.getInstance();
    }

    public void addEntry(Person p){
        if(checkValidityOfCNP(p.getCNP())){
            MainDatabase.addEntry(p);
            System.out.println("Person added successfully");//alternativ, putem returna un boolean care sa indice daca operatioa a reusit
        }
    }
    public void removeEntry(String CNP){
        if(checkValidityOfCNP(CNP)){
            MainDatabase.removeEntry(CNP);
            System.out.println("Person removed successfully");//alternativ, putem returna un boolean care sa indice daca operatioa a reusit
        }
    }
    public Person getData(String CNP){
        if(checkValidityOfCNP(CNP)){
            return MainDatabase.getData(CNP);
        }else return null;
    }

    public static boolean checkValidityOfCNP(String CNP){
        if(!(CNP.charAt(0)=='1' || CNP.charAt(0)=='2' || CNP.charAt(0)=='5' || CNP.charAt(0)=='6' || CNP.charAt(0)=='7' || CNP.charAt(0)=='8')) return false;
        else if (Integer.parseInt(CNP.substring(3,5)) > 12 || Integer.parseInt(CNP.substring(3,5)) <= 0) return false;
        else if (Integer.parseInt(CNP.substring(5,7)) > 31 || Integer.parseInt(CNP.substring(5,7)) <=0) return false;
        else if (computeC(CNP) == CNP.charAt(CNP.length()-1)){
            System.out.println("Invalid CNP");//alternativ se poate arunca o exceptie apoi re introdus CNP-ul
        }

        return true;
    }

    public static int computeC (String CNP){
        int sum = 0;
        String constant = "279146358279";
        for(int i=0;i<12;i++) {
            sum += Character.getNumericValue(CNP.charAt(i)) * Character.getNumericValue(constant.charAt(i));
        }
        sum = sum % 11;
        if(sum<10){return sum;}
        else {return 1;}

    }
}
