public class Cicli2 {
    
    public static void main(String[] args){
       
        //WHILE da 0 a inf
        //controlla prima la condizione
        //ciclo matematico con incremento
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        //controllo logico ciclo booleano 
        boolean controllo = true;
        while(controllo){
            controllo = false;
            System.out.println("Boolean while");
        }
        //ciclo con rottura con il break
        controllo = true;
        while(controllo){
            System.out.println("Broken while");
            break;
            
        }

        //DO-WHILE da 1 a inf
        //esegue il corpo del ciclo almeno una volta e poi controlla la condizione
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while ( i <= 5);

        //FOR
        // for(inizializzazione;condizione;incremento/decremento){//blocco codice}
        for(int j=0; j < 5; j++){
            System.out.println(j);
        }

        //FOR-EACH
        //processare ogni elemento dell'array
        //for(TipoElemento elemento : collezioneOArray)
        
        int[] numeri={1,2,3,4,5};

        
        for(int numero:numeri){
            System.out.println("Numero " + numero);
        }
        
        //se gli elementi dell'array sono stringhe nel ciclo va inizializzatoa String
        String[] stringhe= {"ciao"};
        for(String string:stringhe){
            System.out.println("Stringa " + string);
        }

        //LIMITE: NON SI PUO MODIFICARE DIRETTAMENTE LA COLLEZIONE O ARRAY CON IL FOR-EACH.
        //NON FORNISCE ACCESSO ALL'INDICE 

    }
}
