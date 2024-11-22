package EsercizioPolimorfismo;

public class Persona {

    String nome;
    
    public Persona(String nome){
        this.nome = nome;
    }

    public void saluta(){
        System.out.println("Ciao ciao");
    }
}

 class Pirata extends Persona{

    public Pirata(String nome){
        super(nome);
    }

    public void saluta(){
        System.out.println("Ciao,Ciao io sono un pirata");
    }

    //Overloading
    public void saluta(String saluto){
        System.out.println("Il mio saluto: "+ saluto);
    }

}