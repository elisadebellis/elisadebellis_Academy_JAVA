import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioChef {
    public static void main(String[] args) {

        //creo la lista ingredienti
        ArrayList<String> myIngredients = new ArrayList<String>();
        
        
        Chef myChef = new Chef("Carlo", "Pasticcere", myIngredients);

        Scanner scanner = new Scanner(System.in);
        String check = "y";

        do {
            System.out.println("Inserisci un ingrediente: ");
            String ingrediente = scanner.nextLine();
            //aggiungi alla lista degli ingredienti
            myIngredients.add(ingrediente);
            System.out.println("Vuoi inserire un altro ingrediente? (y/n) ");
            check = scanner.nextLine();
        
    } while (check.equals("y"));

    System.out.println("Con gli ingredienti forniti puoi preparare: ");
    myChef.creaPiatto();
        
        

    }
}


    class Chef {
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
                        System.out.println("Pasta al pomodoro");
                        break;
                    case "Patate":
                        System.out.println("Patate al forno");
                        break;
                    case "Zucchero":
                        System.out.println("Ciambellone");
                        break;
                }

            }
        }
    }

