package Lecture_2_oo.MovieDataBase;

public class Film {
    public int anAparitie;
    public String nume;
    public Actor[] actori;

    public Film (int anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
}
