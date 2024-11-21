import java.util.ArrayList;

public class Utente {

    int idUtente;
    String nome;
    public ArrayList<Film> filmNoleggiati = new ArrayList<Film>();

    public Utente(int idUtente, String nome){
        this.idUtente=idUtente;
        this.nome = nome;
    }

    //aggiunge un film alla lista dei film
    public void noleggiaFilm(Film film){
        filmNoleggiati.add(film);
    }

    //stampa i film dell'utente
    public void myFilms(){
        for (Film film:filmNoleggiati){
            System.out.println(film.toString());
        }
    }

    @Override
    public String toString(){
        return "Utente {" +
        "Nome:" + nome +"," + 
        "idUtente: " + idUtente + "}";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()){
            return false;
        }
        else return false;
    }


    
    
}
