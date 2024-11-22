import java.util.Scanner;

public class MainRistorante {
    public static void main(String[] args){

        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        Ristorante myRistorante = new Ristorante();


        int option;
        User utente = creaUtente();
        stampaMenu();
        option = intScanner.nextInt();
        do {
            
            switch(option){
                case 0:
                    utente = creaUtente();
                    break;
                case 1:
                    System.out.println(utente.toString());
                    break;
                case 2:
                    //controlla se l'utente è gia uno chef o un critico
                    if (!myRistorante.checkUtenteChef(utente) || !myRistorante.checkUtenteCritico(utente)){
                    System.out.println("Vuoi cambiare ruolo in chef o critico?");
                    String ruolo = stringScanner.nextLine();
                    if (ruolo.equals("chef")){

                        System.out.println("Inserisci la password: ");
                        String passwd = stringScanner.nextLine();
                        System.out.println("Chef registrato");
                        myRistorante.addChef(utente,passwd);
                    } else if (ruolo.equals("critico")){

                        System.out.println("Inserisci la password: ");
                        String passwd = stringScanner.nextLine();
                        Critico critico = new Critico(utente.getName(), utente.getEmail(), passwd);
                        System.out.println("Chef registrato");
                        myRistorante.addCritico(critico);
                    } else {
                        System.out.println("Errore input");
                    }
                } else if (myRistorante.checkUtenteChef(utente)){
                    Chef myChef = myRistorante.cercaChef(utente);
                    System.out.println("Che piatto vuoi aggiungere?");
                    String piatto = stringScanner.nextLine();
                    myChef.aggiungiPiatti(piatto);
                    myRistorante.getPiatti();
                }
                    
                    break;
                    

            }
            stampaMenu();
            option = intScanner.nextInt();
        } while(option<4);



    }

    public static User creaUtente(){
        Scanner stringScanner = new Scanner(System.in);


        System.out.println("Benvenuto! Crea un nuovo utente.");
        User utente = new User();
        System.out.println("Inserisci nome: ");
        String nomeUtente = stringScanner.nextLine();
        utente.setName(nomeUtente);
        System.out.println("Inserisci email: ");
        String emailUtente = stringScanner.nextLine();
        utente.setEmail(emailUtente);
        utente.setSoldi();
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
