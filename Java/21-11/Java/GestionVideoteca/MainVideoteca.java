import java.util.Random;
import java.util.Scanner;

public class MainVideoteca {
    
    public static void main(String[] args) {
        
        Scanner scannerInt = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        Videoteca myVideoteca = new Videoteca();

        Film film1 = new Film("Film1", 2010);
        Film film2 = new Film("Film2", 2011);
        Film film3 = new Film("Film3", 2012);
        Film film4 = new Film("Film4", 2013);
        myVideoteca.films.add(film1);
        myVideoteca.films.add(film2);
        myVideoteca.films.add(film3);
        myVideoteca.films.add(film4);

        Random randomID = new Random();
        
        
        //Opzioni menu
        stampaMenu();
        
        int optionMenu = scannerInt.nextInt();
        while (optionMenu<4){
            switch (optionMenu) {
                case 0:
                    System.out.println("Nuovo utente! \nInserisci nome:");
                    String nomeInput = stringScanner.nextLine();
                    int newrandomID = randomID.nextInt(10);
                    System.out.println("Il tuo IDUtente è " + newrandomID);
                    Utente newUtente = new Utente(newrandomID, nomeInput);
                    myVideoteca.addUtente(newUtente);
                    //myVideoteca.stampaUtenti();
                   
                break;
                case 1:
                    System.out.println("Noleggio film!");
                    Utente cercaUtente = loginVideoteca(myVideoteca);
                    myVideoteca.filmUtente(cercaUtente);
                    
                    System.out.println("La lista dei film disponibili nella videoteca: ");
                    myVideoteca.stampaFilmVideoteca();
                    System.out.print("Inserisci titolo film:  ");
                    String filmScelto = stringScanner.nextLine();
                    if (!myVideoteca.checkFilm(filmScelto)){
                        System.out.println("Film non trovato");
                    }else {
                        Film myFilm = myVideoteca.cercaFilmPerNome(filmScelto);
                        System.out.print(myFilm.toString());
                        myVideoteca.addFilmUtente(cercaUtente, myFilm);
                        System.out.println(" Film noleggiato!");
                    }

                    break;
                case 2:
                
                        cercaUtente = loginVideoteca(myVideoteca);
                        myVideoteca.filmUtente(cercaUtente);
                    
                    break;
                case 3:
                    cercaUtente = loginVideoteca(myVideoteca);
                    System.out.print("I tuoi film sono:");
                    cercaUtente.myFilms();
                    System.out.print("Inserisci titolo del film da restituire:  ");
                    filmScelto = stringScanner.nextLine();
                    for (Film film:cercaUtente.filmNoleggiati){
                        if (film.titoloFilm.equals(filmScelto)){
                            Film myFilm = myVideoteca.cercaFilmPerNome(filmScelto);
                            System.out.print(myFilm.toString());
                            myVideoteca.removeFilmUtente(cercaUtente, myFilm);
                            System.out.println(" Film restituito!");
                            break;
                    }else { 
                        System.out.println("Film non trovato");
                    }}
                    
                    break;
                    
               
                    
            }

        stampaMenu();
        optionMenu = scannerInt.nextInt();

    }
    }

    public static void stampaMenu(){

        System.out.println("Benvenuto nella videoteca! Scegli un opzione del menù:");
        System.out.println("0: Registrazione nuovo utente");
        System.out.println("1: Noleggia film");
        System.out.println("2: Visualizza i miei film noleggiati");
        System.out.println("3: Restituisci film");
        System.out.println("4: Esci");
        System.out.print("Inserisci un opzione: ");

    }

    public static Utente loginVideoteca(Videoteca videoteca){
        Scanner scannerInt = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        Utente cercaUtente;
        int i=0;
        do { 
            System.out.print("Inserisci nome utente:  ");
            String utente = stringScanner.nextLine();
            System.out.print("Inserisci IDUtente:  ");
            int id = scannerInt.nextInt();
            cercaUtente = new Utente(id,utente);
            if (!videoteca.checkUtente(cercaUtente)){
                
                System.out.println("Utente non trovato");
            }
            i++;
            } while(!videoteca.checkUtente(cercaUtente) || i>3);
        
            return cercaUtente;

    }

    
}
