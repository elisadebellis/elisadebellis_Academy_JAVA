import java.util.Scanner;

public class MainRistorante {
    public static void main(String[] args){

        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);


        int option;

        do {
            Utente utente = creaUtente();
            stampaMenu();
            option = intScanner.nextInt();
            switch(option){
                case 0:
                    utente = creaUtente();
                    break;
                case 1:
                    System.out.println(utente.toString());
                    break;
                case 2:
                    

            }
        } while(option<4);



    }

    public static Utente creaUtente(){
        Scanner stringScanner = new Scanner(System.in);


        System.out.println("Benvenuto! Crea un nuovo utente.");
        Utente utente = new Utente();
        System.out.println("Inserisci nome: ");
        String nomeUtente = stringScanner.nextLine();
        utente.setName(nomeUtente);
        System.out.println("Inserisci email: ");
        String emailUtente = stringScanner.nextLine();
        utente.setName(emailUtente);
        System.out.println("Utente registrato");

        return utente;
    }

    public static void stampaMenu(){
        System.out.println("Seleziona un'opzione del menu: ");
            System.out.println("0: Registrazione nuovo utente");
            System.out.println("1: Stampa dati utente");
            System.out.println("2: Interazione profilo");
            System.out.println("3: Uscire");
    }
}
