import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio_3 {
    public static void main(String[] args){
        
        ArrayList<String> clienti = new ArrayList<String>();
        
        Integer[][] posti = {{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};
        ArrayList<Integer[]> arrayPosti= new ArrayList<Integer[]>(Arrays.asList(posti));
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nel sistema di prenotazione e ricerca! \n Cosa vuoi fare? \n 0: Prenotare un posto \n 1: Cercare prenotazione \n 2: Visualizzare i posti disponibili e prenotati \n 3: Visualizza report \n 4: Esci");
        int selection = scanner.nextInt();
        
        do {
        //controllo sul numero inserito
        if (selection > 4 || selection < 0){
            System.out.println("Inserisci un numero valido!");
        }
        switch (selection) {
            //prenotazione posto
            case 0:
                System.out.println("Prenotazione posto! \n Seleziona un posto disponibile: (fila,posto)");
                for (int i=0; i<posti.length; i++){
                    System.out.println("Fila "+ i);
                    System.out.print("Posti: ");
                    for (int j=0; j<posti[i].length; j++){
                        System.out.print( j + " " );
                    }
                    System.out.print("\n");
                }

                int fila = scanner.nextInt();
                int posto = scanner.nextInt();

                
                //arrayPosti.remove(arrayPosti)

                
                break;
            // cercare prenotazione 
            case 1:
            
            break;
            //visualizza posti disponibili
            case 2:
            
            break;
            //visualizza report
            case 3:
            
            break;
            
        }

        selection = scanner.nextInt();

    }while( selection != 4);
}
}
