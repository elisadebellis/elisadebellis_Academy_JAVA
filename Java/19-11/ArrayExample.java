import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

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

        //Array Multidimensionale (Matrice)
        int[][] myNumbers = { {1,2,3,4}, {5,6,7}};
        System.out.println(myNumbers[1][2]); //Stampa 7

        for (int i =0; i<myNumbers.length; i++){
            for (int j=0; j<myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }

        

    }
}
