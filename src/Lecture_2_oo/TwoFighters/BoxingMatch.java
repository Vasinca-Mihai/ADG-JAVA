package Lecture_2_oo.TwoFighters;

public class BoxingMatch {

    Fighter f1;
    Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2){
        this.f1 = f1;
        this.f2 = f2; //nu stiam daca trebuie sa copiem tot obiectul sau doar adresa (nu eram prezent cand sa rezolvat exercitiul)
    }

    public String Fight(Fighter f1, Fighter f2){
        while(f1.health >0 && f2.health>0){
            f1.attack(f2);
            f2.attack(f1);
        }
        if(f1.health>0 && f2.health<=0){
            return f1.name;
        }
        else if(f2.health>0 && f1.health<=0){
            return f2.name;
        }
        else{
            return "No winner!";
        }
    }
}
