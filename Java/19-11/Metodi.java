public class Metodi {
    public static void main(String[] args){
        myMethod();

    }

    static void myMethod(){
        //code 
    }
    
    public int somma(int a, int b){
        return a + b;
    }
    
    //parametri variabili (vargs) variable-length arguments: accetta 
    public int sommaMultipla(int... numeri){
        int somma =0;
        for (int numero:numeri){
            somma+=numero;
        }
        return somma;
        }
    }

