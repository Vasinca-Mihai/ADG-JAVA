package Lecture_3_Design_patterns.Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    private List<Apartament> apartamente = new ArrayList<Apartament>();

    public void reprezent(Apartament apartament){
        apartamente.add(apartament);
    }

    public Apartament rent(Student student){
        Apartament rentedApartament = null;
        if(student.getName().startsWith("P")){
            return null;
        }else{
            for(int i = 0;i<apartamente.size();i++){
                if(apartamente.get(i).getMonthlyRentCost()<student.getMoney()){
                    rentedApartament = apartamente.get(i);
                    apartamente.remove(i);
                    return rentedApartament;
                }
            }
        }
        return null;
    }

}
