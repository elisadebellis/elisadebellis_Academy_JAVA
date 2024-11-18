import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Inserisci un Nome Utente:");

        //Inserire Nome Utente 
        String myUtente = myObj.nextLine();
        //Controllo sulla lunghezza del nome utente
        if (myUtente.length() > 3){
            System.out.println("Nome Utente valido");
        } else {
            System.out.println("Nome Utente non valido");
        }
        
        System.out.println("Inserisci la password (almeno una lettera maiuscola):");
        String myPassowrd = myObj.nextLine();

        if (myPassowrd.toLowerCase() == myPassowrd ){ //controllare se c'è una lettera minuscola
            System.out.println("Inserisci almeno una lettera maiuscola");
        }
        else {
            System.out.println("Password valida!");
        }

        //nuovo Scanner
        Scanner myObj1 = new Scanner(System.in); 
        System.out.println("Inserisci un IDUtente:");

        int myID = myObj1.nextInt();
        if (myID > 2){
            System.out.println("Utente generico");
        } else if (myID == 1) {
            System.out.print("Utente Amministratore");
        } else {
            System.out.println("Utente non valido!");
        }


    }
}
