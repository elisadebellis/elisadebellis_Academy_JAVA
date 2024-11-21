
public class Film {

    public String titoloFilm;
    public int annoUscita;

    //costruttore
    public Film(String titoloFilm, int annoUscita){
        this.titoloFilm = titoloFilm;
        this.annoUscita = annoUscita;
    }

    //metodo per restituire il titolo
    public String getTitoloFilm(){
        return titoloFilm;
    }

    //metodo per restituire l'anno di uscita
    public int getAnnoUscita(){
        return annoUscita;
    }

    //metodo per modificare il titolo
    public void setTitoloFilm(String nuovoTitolo){
        titoloFilm = nuovoTitolo;
    }

    //metodo per modificare l'anno di uscita
    public void setAnnoUscita(int nuovoAnno){
        annoUscita = nuovoAnno;
    }

    @Override
    public String toString(){
        return "Film {" +
        "Titolo:" + titoloFilm +"," + 
        "Anno di Uscita: " + annoUscita;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()){
            return false;
        }
        else return false;
    }





    
}
