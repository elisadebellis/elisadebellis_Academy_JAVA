import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio_3 {
    public static void main(String[] args){
        
        ArrayList<String> clienti = new ArrayList<String>();

        float nPostiDisponibili =0;
        
        Integer[][] posti = {{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};
        for (Integer[] riga:posti){
            for (int r:riga){
                nPostiDisponibili+=1;
            }

        }
        ArrayList<ArrayList<Integer>> arrayPostiDisponibili= new ArrayList<ArrayList<Integer>>();
        for (Integer[] riga:posti){
            arrayPostiDisponibili.add(new ArrayList<>(Arrays.asList(riga)));
        }

        
        ArrayList<String> postiPrenotati = new ArrayList<String>();
        
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        

        
        System.out.print("Benvenuto! Cosa vuoi fare? \n 0: Prenotare un posto \n 1: Cercare prenotazione \n 2: Visualizzare i posti disponibili e prenotati \n 3: Visualizza report \n 4: Esci \n Inserisci un opzione: ");
        int selection = scanner.nextInt();
        
        do {
        //controllo sul numero inserito
        if (selection > 4 || selection < 0){
            System.out.println("Inserisci un numero valido!");
        }
        switch (selection) {
            //prenotazione posto
            case 0:
                System.out.print("Prenotazione posto! \n Inserisci nome cliente: ");
                String cliente = scanner2.nextLine();
                clienti.add(cliente);
                System.out.println(" \n Seleziona un posto disponibile: ");
                System.out.println(arrayPostiDisponibili);

                System.out.println("Seleziona fila: (0,1,2)");
                int fila = scanner.nextInt();
                do {
                if (fila > 2){
                    System.out.println("Fila non valida! Reinserisci fila:");
                    fila = scanner.nextInt();
                }
                
                }while (fila > 2);
                    
                
                System.out.println("Seleziona posto: (1,2,3,4,5,6,7,8)");
                int posto = scanner.nextInt();
                do {
                if (posto > 7){
                    System.out.println("Posto non valido! Reinserisci posto:");
                    posto = scanner.nextInt();
                }
                
                }while (fila > 7);

                
                arrayPostiDisponibili.get(fila).remove(posto-1);
                nPostiDisponibili--;
                postiPrenotati.add(cliente+":"+fila+","+posto);
                System.out.println("Posto prenotato!");
                


                
                break;
            // cercare prenotazione 
            case 1:
                System.out.println("Cerca prenotazione");
                System.out.print("Inserisci nome cliente: ");
                String cercaCliente = scanner2.nextLine();
                int indice =0;
                
                boolean prenotazioneTrovata = false;
                for (int i=0; i<postiPrenotati.size();i++){

                    if(postiPrenotati.get(i).contains(cercaCliente)){
                        indice = i;
                        break;
                    }
                }

                System.out.println(postiPrenotati.get(indice));
            

            
                break;
            //visualizza posti disponibili
            case 2:
                
                System.out.print("Posti disponibili: ");
                System.out.println(arrayPostiDisponibili);
                System.out.print("Posti prenotati: ");
                System.out.println(postiPrenotati);

            
            break;
            //visualizza report
            case 3:
            System.out.print("Report: ");
            int nPostiPrenotati = postiPrenotati.toArray().length;
            System.out.println(nPostiDisponibili);
            System.out.println(nPostiPrenotati);

            
            float percentualePostiDisponibili = (nPostiDisponibili / 24) *100;
            System.out.println("Percentuale posti disponibili: "+ percentualePostiDisponibili + "%");
            
            
            break;
            
        }
        System.out.print("Cosa vuoi fare? \n 0: Prenotare un posto \n 1: Cercare prenotazione \n 2: Visualizzare i posti disponibili e prenotati \n 3: Visualizza report \n 4: Esci \n Inserisci un opzione:");
        selection = scanner.nextInt();

    }while( selection != 4);
}
}
