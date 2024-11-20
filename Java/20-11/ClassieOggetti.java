

public class ClassieOggetti {
    public static void main(String[] args){
        
        Auto myAuto = new Auto("Ferrai", "rosso"); // chiama il costruttore

        myAuto.accelera(50);

        System.out.println(myAuto.colore);
    }
}

class Auto{
    //Campi della classe 
    public String modello;
    public String colore;
    public int velocita;

    //Costruttore parametrizzato (di default è non parametrizzato) 
    public Auto(String modello, String colore){
        this.modello = modello;
        this.colore = colore;
        this.velocita = 0; //velocita iniziale
    }

    //Metodo per accelerare 
    public void accelera(int incremento){
        velocita+=incremento;
    }
}
