import java.util.Arrays;
import java.util.Scanner;

public class Esercizio_1_Extra {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        //definisco un array
        int[] numeri = {0,0,0,0,0};
        int somma = 0;
        do {
        System.out.println("Inserisci 5 numeri la cui somma è un numero negativo:");
        for (int j=0; j<numeri.length;j++){
            //salvo i numeri inseriti dall'utente
            numeri[j] = scanner.nextInt();
        }
        
        for(int numero:numeri){
            //calcolo la somma
            somma+= numero;
        }} while (somma > 0);


        System.out.println("L'array è:" + Arrays.toString(numeri));
        
    }
    
}
