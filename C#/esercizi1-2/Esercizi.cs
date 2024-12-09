using System;
using System.Net;

class Esercizi{
    static void Main(string[] args){
       
       //esercizio1();

       esercizio2();
    }

    public static void esercizio1(){
        List<int> mynums = new List<int>();

       while (true){
       Console.Write("Inserisci un numero (o 'esci' per terminare):");
        string numero = Console.ReadLine();

        if (numero == "esci"){
            break;
        }
        int num = int.Parse(numero);

        if (num % 2 == 0){
            Console.WriteLine("Numero pari!");
        }
        else {
            Console.WriteLine("Numero dispari!");
        }
       
        //Add per aggiungere alla lista
        mynums.Add(num);
       }

        Console.Write("Stampare numeri pari o dispari?");
        string tipo = Console.ReadLine();
        
        //si usa in 
        foreach(int n in mynums){
            if (tipo == "pari"){
                if (n%2 == 0){
                    Console.Write(n + " ");
                }
            }
            else if (tipo == "dispari") {
                if (n%2 != 0){
                    Console.Write(n + " ");
                }

            }
        }
    }

    public static void esercizio2(){

        while (true){
            //differenza Write e WriteLine
            Console.WriteLine("Inserisci una frase  (o 'esci' per terminare):");
            string frase = Console.ReadLine();

            if (frase == "esci"){
                break;
            }
            
            //suddivide la stringa con spazi in diverse parole
            string[] parole = frase.Split(" ");


            int conta=0;
            //si usa in
            foreach (string p in parole){
                if (p!=""){
                    conta++;
                }
                
            }

            Console.WriteLine($"Ci sono {conta} parole nella frase.");
        }

    }

}
