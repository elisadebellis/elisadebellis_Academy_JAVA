import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio_SpedizioniPenne {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ListaSpedizioni = new ArrayList<ArrayList<Integer>>();

        System.out.print("Cosa vuoi fare? \n 0: Crea Nuova Spedizione \n 1: Visualizza Spedizioni \n 2: Calcolo totale penne\n 3: Cerca Spedizione \n 4: Esci \n Inserisci un opzione: ");
        int input = scanner.nextInt();

        while (input!=4){
        switch (input) {
            case 0:
                ArrayList<Integer>  spedizione = creaNuovoOrdine();
                aggiungiSpedizione(ListaSpedizioni,spedizione);
                break;

            case 1:
                visualizzaSpedizioni(ListaSpedizioni);
                break;
            case 2:
                calcoloTotalePenne(ListaSpedizioni);
                break;
        
            case 3:
                cercaSpedizione(ListaSpedizioni);
                break;

        }

        System.out.print("Cosa vuoi fare? \n 0: Crea Nuova Spedizione \n 1: Visualizza Spedizioni \n 2: Calcolo totale penne\n 3: Cerca Spedizione \n 4: Esci \n Inserisci un opzione: ");
        input = scanner.nextInt();

    
    } 

        
    }

    public static ArrayList<Integer>  creaNuovoOrdine(){
        
        Scanner ordine = new Scanner(System.in);

        ArrayList<Integer> spedizione = new ArrayList<Integer>();

        System.out.println("Quante penne rosse vuoi ordinare? ");
        int rosso = ordine.nextInt();
        spedizione.add(rosso);
        System.out.println("Quante penne blu vuoi ordinare? ");
        int blu =  ordine.nextInt();
        spedizione.add(blu);
        System.out.println("Quante penne verdi vuoi ordinare? ");
        int verde = ordine.nextInt();
        spedizione.add(verde);
        System.out.println("Quante penne nere vuoi ordinare? ");
        int nero = ordine.nextInt();
        spedizione.add(nero);

        System.out.println("Nuovo ordine: " + spedizione);

        return spedizione;
    }

    public static void aggiungiSpedizione(ArrayList<ArrayList<Integer>> ListaSpedizioni, ArrayList<Integer> spedizione){
        
        ListaSpedizioni.add(spedizione);
    }

    public static void visualizzaSpedizioni(ArrayList<ArrayList<Integer>> ListaSpedizioni){
       for(ArrayList<Integer> sp:ListaSpedizioni){
            System.out.println("Spedizioni: " + sp);
       }
    }

    public static void calcoloTotalePenne(ArrayList<ArrayList<Integer>> ListaSpedizioni){
        
        int rosso = 0;
        int blu = 0;
        int verde = 0;
        int nero = 0;

        for (int i=0; i<ListaSpedizioni.size(); i++){
            rosso += ListaSpedizioni.get(i).get(0);
            blu += ListaSpedizioni.get(i).get(1);
            verde += ListaSpedizioni.get(i).get(2);
            nero += ListaSpedizioni.get(i).get(3);
            }
        

        System.out.println("Rosso: " + rosso + " Blu: " + blu + " Verde: " + verde +" Nero: " + nero);
    }

    public static Integer[] cercaSpedizione(ArrayList<ArrayList<Integer>> ListaSpedizioni) {

        Integer[] spedizioneTrovata = {};
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci colore:");
        String colore = scanner.nextLine();

        switch (colore) {
            case "rosso":
            for (int i=0; i<ListaSpedizioni.size(); i++){
                if (ListaSpedizioni.get(i).get(0) > 0){
                    System.out.println("Spedizione trovata" + ListaSpedizioni.get(i));
                    break;
                }
            }
            break;

            case "blu":
            for (int i=0; i<ListaSpedizioni.size(); i++){
                if (ListaSpedizioni.get(i).get(1) > 0){
                    System.out.println("Spedizione trovata" + (ListaSpedizioni.get(i)));
                    break;
                }
            }
            break;

            case "verde":
            for (int i=0; i<ListaSpedizioni.size(); i++){
                if (ListaSpedizioni.get(i).get(2) > 0){
                    System.out.println("Spedizione trovata" + (ListaSpedizioni.get(i)));
                    break;
                }
            }
            break;

            case "nero":
            for (int i=0; i<ListaSpedizioni.size(); i++){
                if (ListaSpedizioni.get(i).get(3) > 0){
                    System.out.println("Spedizione trovata: " + (ListaSpedizioni.get(i)));
                    break;
                }
            }
            break;
        
        }

        return spedizioneTrovata;
        
    }
}







    


    



