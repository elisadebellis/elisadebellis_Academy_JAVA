import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){
       
        // 5 posizioni a partire da 0
        int[] numeri = {10,20,30,40,50};
        //stampa l'elemento con indice 0 
        System.out.println(numeri[0]); //Stampa 10

        //Metodi per gli array definiti come propietà (esempio: .length)
        System.out.println(numeri.length);
        for (int i =0; i<numeri.length ; i++){
            System.out.println(i); // Stampa 0,1,2,3,4
        }

        //.toString() converte un array in un formato leggibile stringa (importare Arrays)
        //utile per stampare gli array
        System.out.println(Arrays.toString(numeri));
    }
}
