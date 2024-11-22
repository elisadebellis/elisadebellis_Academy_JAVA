package EsercizioPolimorfismo;

public class MainPersona {

    public static void main(String[] args){
        
        Persona persona1 = new Persona("Carlo");
        Persona persona2 = new Persona("Filippo");

        persona1.saluta();
        persona2.saluta();

        Pirata pirata = new Pirata("Federico");

        pirata.saluta();
        pirata.saluta("ciao");
    }
    
}
