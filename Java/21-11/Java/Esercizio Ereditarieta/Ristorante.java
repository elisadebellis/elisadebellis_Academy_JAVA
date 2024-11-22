import java.util.ArrayList;
import java.util.Random;

public class Ristorante {
    
    protected ArrayList<String> piatti = new ArrayList<String>();
    protected ArrayList<String> valutazioniPiatti = new ArrayList<String>();
    protected ArrayList<Chef> chefs = new ArrayList<Chef>();
    protected ArrayList<Critico> critici = new ArrayList<Critico>();


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

    public void addChef(User user, String pss){
        Chef chef = new Chef(user.getName(), user.getEmail(), pss);
        chefs.add(chef);
    }

    public void addCritico(Critico critico){
        critici.add(critico);
    }

    public boolean checkUtenteChef(User user){
        for (Chef chef:chefs){
            if (user.getName().equals(chef.getName())){
                return true;
            }
        }
        return false;
    }

    public boolean checkUtenteCritico(User user){
        return critici.contains(user);
    }

    public Chef cercaChef(User utente){
        for (Chef chef:chefs){
            if (chef.getName().equals(utente.getName())){
                return chef;
            }
        }
        return null;
    }


}

class User extends Ristorante {
    
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

class Chef extends User {

    private String psswd;

    public Chef(String nome, String email,String psswd){
        this.psswd = psswd;
    }

    public void aggiungiPiatti(String piatto){
        super.piatti.add(piatto);
    }
}

class Critico extends User {

    private String nome;
    private String email;
    private String passkey;

    public Critico(String nome, String email, String pass){
        this.nome = nome;
        this.email = email;
        this.passkey = pass;
    }

    public void aggiungiValutazione(String valutazione){
        super.valutazioniPiatti.add(valutazione);
    }
}


