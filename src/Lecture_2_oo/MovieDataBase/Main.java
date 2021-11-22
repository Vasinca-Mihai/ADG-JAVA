package Lecture_2_oo.MovieDataBase;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actoroscar1990 = new Actor("actor cu 2 oscaruri",35,
            new Premiu[]{oscar1990,oscar2000});
        Actor actoroscar2010 = new Actor("actor cu oscar din 2000",55,
            new Premiu[]{oscar2000});
        Actor actoroscar2018 = new Actor("actor cu oscar din 2018",23,
            new Premiu[]{oscar2018});
        Actor actorfarapremii01 = new Actor("actor fara oscar 01",33,
            new Premiu[]{});
        Actor actorfarapremii02 = new Actor("actor fara oscar 02",60,
            new Premiu[]{});
        Actor actorfarapremii03 = new Actor("actor fara oscar 03",20,
            new Premiu[]{});

        Film film1 = new Film(1990,"film cu actori de oscar",
                new Actor[]{actoroscar1990,actorfarapremii01});
        Film film2 = new Film(2010,"film cu actori fara preamii2",
                new Actor[]{actorfarapremii01,actorfarapremii02,actorfarapremii03});
        Film film3 = new Film(2010,"film cu actori fara preamii 03",
                new Actor[]{actorfarapremii01,actorfarapremii02,actorfarapremii03});
        Film film4 = new Film(2018,"film cu actori de oscar",
                new Actor[]{actoroscar2010,actoroscar2018,actorfarapremii02});
        Film film5 = new Film(2018,"film cu actori fara preamii5",
                new Actor[]{actorfarapremii02,actorfarapremii03});

        Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney",new Film[]{film3,film4,film5});
        Studio[] studioDatabase = new Studio[]{studio1,studio2};

        //getStudioWithMoreTahn2Movies(studioDatabase);
        //getStudiWithActorCuDouaOscaruri(studioDatabase);
        getMoviesWithAgeAbove50(studioDatabase);

    }

    public static void getStudioWithMoreTahn2Movies(Studio[] database){
        for(Studio i: database) {
            if(i.filme.length > 2){
                System.out.println(i.nume);
            }
        }
    }

    public static void getStudiWithActorCuDouaOscaruri(Studio[] database){
        for(Studio i : database){
            for(Film j : i.filme){
                for(Actor z : j.actori){
                    if(z.nume.equals("actor cu 2 oscaruri")){
                        System.out.println(i.nume);
                        break;
                    }
                }
                break;
            }
        }
    }

    public static void getMoviesWithAgeAbove50(Studio[] database){
        for(Studio i: database){
            for(Film j: i.filme){
                for(Actor z: j.actori){
                    if(z.varsta > 50){
                        System.out.println(j.nume);
                        break;
                    }
                }
            }
        }
    }
}
