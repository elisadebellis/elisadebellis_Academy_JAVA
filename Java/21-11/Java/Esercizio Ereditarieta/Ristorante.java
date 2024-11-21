import java.util.ArrayList;
import java.util.Random;

public class Ristorante {
    
    protected ArrayList<String> piatti = new ArrayList<String>();
    protected ArrayList<String> valutazioniPiatti = new ArrayList<String>();

    public void getPiatti(){
        for (String piatto:piatti){
            System.out.println(piatto);
        }
    }

    public void getValutazioniPiatti(){
        for (String valutazione:valutazioniPiatti){
            System.out.println(valutazione);
        }
    }


}

class Utente extends Ristorante {
    
    protected String nome;
    protected String email;
    protected float soldi;

    private Random randomInt = new Random();

    public void setName(String name){
        this.nome = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSoldi(){
        this.soldi = randomInt.nextInt(100);
    }

    public String getName(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public float getSoldi(){
        return soldi;
    }

    @Override
    public String toString(){
        return "Utente {" +
        "Nome:" + nome +"," + 
        "Email: " + email +"," +"Soldi: " + soldi + "}";
    }


}

class Chef extends Utente {

    private String psswd;

    public Chef(String nome, String email,String psswd){
        this.psswd = psswd;
    }

    public void aggiungiPiatti(String piatto){
        super.piatti.add(piatto);
    }
}

class Critico extends Utente {

    private String nome;
    private String email;

    public Critico(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void aggiungiValutazione(String valutazione){
        super.valutazioniPiatti.add(valutazione);
    }
}


