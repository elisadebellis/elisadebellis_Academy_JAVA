import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Videoteca {
    
    public ArrayList<Utente> utenti = new ArrayList<Utente>();
    public ArrayList<Film> films = new ArrayList<Film>();

    //aggiunta di film nella videoteca
    public void addFilmVideoteca(Film film){
        films.add(film);
    }

    //rimozione film dalla videoteca
    public void removeFilmVideoteca(Film film){
        films.remove(film);
    }

    //visualizza film della videoteca
    public void stampaFilmVideoteca(){
        for (Film f:films){
            System.out.println(f.toString());
        }
    }

    //controlla se l'utente è registrato 
    public boolean checkUtente(Utente utente){
        
       for (Utente u:utenti){
        if (u.nome.equals(utente.nome) && u.idUtente == utente.idUtente){
            return true;
        }
        else return false;
       }
       return false;
        
    }

    //cercare film per nome
    public Film cercaFilmPerNome(String nomeFilm){
        for (Film f:films){
            if (f.titoloFilm.equals(nomeFilm)){
                return f;
            } 
        }
        return null;
    }

    //controlla se il film è presente nella videoteca 
    public boolean checkFilm(String nomefilm){
        for (Film f:films){
            if (f.titoloFilm.equals(nomefilm)){
                return true;
            
            } else return false;
        }
        return false;
        
    }

    //aggiunta di un utente
    public void addUtente(Utente utente){
        utenti.add(utente);
    }

    public void stampaUtenti(){
        for (Utente u:utenti){
            System.out.println(u.toString());
        }
    }

    //visualizza film noleggiati da un utente
    public void filmUtente(Utente utente){

        if (utente.filmNoleggiati.size()== 0){
            System.out.println("Nessun film noleggiato");
        }else {
        for (Film film:utente.filmNoleggiati){
            System.out.println(film.toString());
        }}
    }

    //noleggio film per l'utente
    public void addFilmUtente(Utente utente, Film film){
        //aggiungi film all'utente
        utente.noleggiaFilm(film);
        //rimuovi film dalla videoteca
        films.remove(film);
    }

    public void removeFilmUtente(Utente utente, Film film){

        //controlla se il film è presente nella lista dei film dell'utente
        for (Film cercafilm:utente.filmNoleggiati){
            if(! cercafilm.equals(film)){
                System.out.println("Film non presente nella lista di "+ utente.nome);
            } else {
                utente.filmNoleggiati.remove(film);
            }

        }
    }
}
