

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


    //QUASI SEMPRE DA FAREE!!
    //Metodo di riscrittura
    @Override
    public String toString(){
        return "Auto{" +
        "modello:" + modello;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()){
            return false;
        }
        Auto auto = (Auto) obj;
        return true;
    }

    @Override
    //restituisce un valore hash per un oggetto
    //SOLO SE SOVRASCRIVI EQUALS FARE ANCHE HASCODE perche devono avere anche lo stesso hash
    public int hashCode(){
        return modello.hashCode() + 31; //calcola un valore hash
    }
}
