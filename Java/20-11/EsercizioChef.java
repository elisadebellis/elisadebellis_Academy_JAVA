import java.util.ArrayList;

public class EsercizioChef {
    public static void main(String[] args) {

    }


    public class Chef {
        String nome;
        String tipoChef;
        ArrayList<String> ingredienti;

        public Chef(String nome, String tipoChef, ArrayList<String> ingredienti){
            this.nome = nome;
            this.tipoChef = tipoChef;
            this.ingredienti = ingredienti;
        }

        public void creaPiatto(){
            for (String ingrediente:ingredienti){
                switch(ingrediente){
                    case "Pomodoro":
                        System.out.println("Con i tuoi ingredienti puoi preparare la pasta al pomodoro");
                    
                    case "Patate":
                        System.out.println("Patate al forno");
                    
                }

            }
        }
    }
}
