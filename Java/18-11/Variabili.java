public class Variabili{
    public static void main(String[] args){
        
        //tre tipi principali: di testo, numerici e booleani 
        boolean provaBool = true;
        int numero = 12;
        String parola = "Ciao Mondo";
        
        System.out.println(provaBool); 
        System.out.println(numero);
        System.out.println(parola);  

        //final si usa per creare una costante (cioè immutabile, di sola lettura)
        final int numero2 = 3;
        //numero2 = 4; //error! non si puo riassegnare. 

        String testo = "Prova";
        testo = "Mondo";
        System.out.println("Ciao" + testo);

        //si possono dichiarare varibili dello stesso tipo su una unica riga separato da virgole
        int x=5, y=6, z=50; //Cascata
        System.out.println(x + y +z);
        int x1,y1,z1; //Cascata divisa
        x1 = y1 = z1 = 50;

        //NOMI DELLE VARIABILI
        int minutiPerOra = 60; //buono
        int m = 60; //non facile da intuire
        // 1. INIZIARE CON UNA ALETTERA MINUSCOLA
        // 2. NO SPAZI VUOTI
        // 3. FANNO DISTINZIONE TRA MAIUSCOLO E MINUSCOLO myVar e myvar sono diverse
        // 4. Le parole chiavi di Java non possono essere usati come nomi 

        float myFloat = 5.57f;
        double myDouble1 = 19.99d;

        float myFloat1 = 35e3f; // e si usa per indicare potenze 

        //CASTING -> conversione di tipo;

        int myInt = 9;
        double myDouble = (int) myInt;

        System.out.println(myDouble); //9.0

        double myDouble2 = 9.78d;
        int myInt1 = (int) myDouble2;

        System.out.println(myInt1); ///9


        


    }
}