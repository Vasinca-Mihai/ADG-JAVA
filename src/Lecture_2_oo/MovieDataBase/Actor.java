package Lecture_2_oo.MovieDataBase;

public class Actor {
    public int varsta;
    public String nume;
    public Premiu[] premii;

    public Actor (String nume, int age, Premiu[] premii){
        this.varsta = age;
        this.nume = nume;
        this.premii = premii;
    }
}
