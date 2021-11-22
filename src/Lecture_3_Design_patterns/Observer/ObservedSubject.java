package Lecture_3_Design_patterns.Observer;

public interface ObservedSubject {
    void register(Observer obj);

    void unregister (Observer obj);

    void notifyObservers(String message);
}
