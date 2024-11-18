import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){

        System.out.println("Inserisci 5 Utenti:");
        int i=1;
        while (i<=5){
        
            Scanner myObj = new Scanner(System.in); 
            System.out.println("Inserisci un Nome Utente " + i);

            //Inserire Nome Utente 
            String myUtente = myObj.nextLine();
            //Controllo sulla lunghezza del nome utente
            if (myUtente.length() > 3){
                System.out.println("Nome Utente "+ i + " valido");
            } else {
                System.out.println("Nome Utente non valido");
            }
            
            System.out.println("Inserisci la password (almeno una lettera maiuscola):");
            String myPassowrd = myObj.nextLine();

            while (myPassowrd.toLowerCase() == myPassowrd ){ //controllare se c'è una lettera minuscola
                System.out.println("Password non valida (inserire una maiuscola):");
                myPassowrd = myObj.nextLine();
            }
            

            //nuovo Scanner
            Scanner myObj1 = new Scanner(System.in); 
            System.out.println("Inserisci un IDUtente:");

            int myID = myObj1.nextInt();
            if (myID >= 2){
                System.out.println("Utente generico");
            } else if (myID == 1) {
                System.out.print("Utente Amministratore");
            } else {
                System.out.println("Utente non valido!");
            }
            i++;
        }
        
    }

}
