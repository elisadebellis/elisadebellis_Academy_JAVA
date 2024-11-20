import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioLibri{
    public static void main(String[] args) {
            
        Libro myLibro = new Libro("Libro1", "Autore1", 300);
        Biblioteca myBiblioteca = new Biblioteca();
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        myBiblioteca.aggiungiLibro(myLibro);
        myBiblioteca.stampaLibri();

        System.out.println("Inserisci l'autore del libro che vuoi cercare: ");
        String cercaAutore = scannerString.nextLine();
        myBiblioteca.cercareLibriPerAutore(cercaAutore);
        System.out.println("Inserisci un numero max di pagine del libro che vuoi cercare: ");
        int cercaMaxPagine = scannerInt.nextInt();
        myBiblioteca.cercareLibroPerMaxPagine(cercaMaxPagine);

    }

}

class Biblioteca {

        ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
        
        // Aggiungi Libro alla biblioteca
        public void aggiungiLibro(Libro libro){
                elencoLibri.add(libro);
        }
        
        // Stampa tutti i libri nella biblioteca
        public void stampaLibri(){
            for (Libro libro:elencoLibri){
                System.out.println(libro.NomeLibro);
            }
        }
        
        // Cerca libro per autore
        public void cercareLibriPerAutore(String autore){
            //cerco nell'elenco dei libri
            for (Libro libro:elencoLibri){

                if (libro.NomeAutore.equals(autore)){
                    System.out.println("Il libro di "+autore+" è: " + libro.NomeLibro );
                }
                else {
                    System.out.println("Libro non trovato");
                }
            }
        }

        // Cerca Libro per max pagine
        public void cercareLibroPerMaxPagine(int pagine){
            //cerco nell'elenco dei libri
            for (Libro libro:elencoLibri){

                if (libro.nPagine <= pagine){
                    System.out.println("Il libro che ha almeno "+pagine+" pagine è: " + libro.NomeLibro );
                }
                else {
                    System.out.println("Libro non trovato");
                }
            }
        }

}

class Libro{

    public String NomeLibro;
    public String NomeAutore;
    public int nPagine;
    
    //Costruttore
    public Libro(String NomeLibro, String NomeAutore, int nPagine){
        this.NomeLibro = NomeLibro;
        this.NomeAutore = NomeAutore;
        this.nPagine = nPagine;
    }
    
}

