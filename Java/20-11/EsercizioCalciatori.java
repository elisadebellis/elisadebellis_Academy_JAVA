import java.util.ArrayList;
import java.util.Random;

public class EsercizioCalciatori {

    public static void main(String[] args) {

        Squadra mySquadra = new Squadra("mySquadra");

        mySquadra.creaSquadra();
    }
    
}

class Squadra{

    String nomeSquadra;
    ArrayList<Calciatore> calciatori = new ArrayList<Calciatore>();
    
    public Squadra(String nomeSquadra){
        this.nomeSquadra = nomeSquadra;
        
    }

    public void creaSquadra(){

        String[] nomi = {"Luca", "Paolo", "Mario", "Giovanni", "Federico", "Alberto", "Giuseppe","Mirko","Lorenzo","Andrea"};
        String[] ruoli = {"Portiere", "Attaccante", "Difensore", "Centrocampista"};
        Random random = new Random();
        for (int i=0; i<11; i++ ){
            int nomeRandom = random.nextInt(9);
            int ruoloRandom = random.nextInt(3);
            Calciatore calciatore = new Calciatore(nomi[nomeRandom], ruoli[ruoloRandom]);

            if (!calciatori.contains(calciatore)){
                calciatori.add(calciatore);
            }
        }

        for (Calciatore calciatore:calciatori){

             System.out.println(calciatore.nome + " " + calciatore.ruolo);
        }
    }


    public static ArrayList<Calciatore> stampaCalciatori(Squadra squadra){
        return squadra.calciatori;
    }
}
class Calciatore {
    String nome;
    String ruolo;

    public Calciatore(String nome, String ruolo){
        this.nome = nome;
        this.ruolo = ruolo;
    }
}