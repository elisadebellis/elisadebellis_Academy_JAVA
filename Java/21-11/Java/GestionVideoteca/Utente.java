import java.util.ArrayList;

public class Utente {

    int idUtente;
    String nome;
    ArrayList<Film> filmNoleggiati;

    public Utente(int idUtente, String nome){
        this.idUtente=idUtente;
        this.nome = nome;
    }

    public void noleggiaFilm(Film film){
        filmNoleggiati.add(film);
    }

    public void myFilms(){
        for (Film film:filmNoleggiati){
            film.toString();
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
