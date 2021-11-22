package Lecture_3_Design_patterns.Observer;
import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> studentList = new ArrayList<Observer>();

    public void register(Observer observer){
        studentList.add(observer);
    }

    public void unregister (Observer obj){
        for(int i = 0 ;i<studentList.size();i++){
            if(studentList.get(i) == obj){
                studentList.remove(i);
                return;
            }
        }
    }

    public void notifyObservers(String message){
        for(int i=0;i<studentList.size();i++){
            studentList.get(i).update(message);
        }
    }

    public void teach (String subj){
        for(int i=0;i<studentList.size();i++){
            studentList.get(i).update(subj);
        }
    }
}
