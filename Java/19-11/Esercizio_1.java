import java.util.Scanner;

public class Esercizio_1 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero negativo:");

        int myNum = scanner.nextInt();
        
        while (myNum>0){ 
                
            //controllare se il numero è pari
            if (myNum % 2 == 0){
                System.out.println("Hai inserito un numero pari!");
            } else {
                System.out.println("Hai inserito un numero dispari!");
            }
            
            System.out.println("Numero non valido! Inserire un numero negativo:");
            myNum = scanner.nextInt();
        }
    }
}
