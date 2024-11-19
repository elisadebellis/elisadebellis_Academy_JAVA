import java.util.Scanner;

public class ScannerExample {
    //PRENDERE DATI IN INPUT
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in); 
        System.out.println("Inserisci un numero int:");

        float myNumber = (float) myObj.nextInt(); //riporta il valore di tipo int scritto dall'utente + casting a float
        System.out.println("My float number is: " + myNumber);

        System.out.println("Inserisci un numero float:");
        int myInt = (int) myObj.nextFloat(); //legge i valori di tipo float + casting a int
        System.out.println("My integer number is: " + myInt);

        myObj.close(); //fatto automaticamente dal builder, non serve 

    }
}
