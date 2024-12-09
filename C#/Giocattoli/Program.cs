using System;
class Giocattoli{
       

        public string Nome {get; private set;}
        public string Materiale {get; private set;}
        public decimal Prezzo_prod {get; private set;}
        public decimal Prezzo_vend {get; private set;}

        public Giocattoli(string nome,string materiale, decimal prezzo_prod, decimal prezzo_vend){
            Nome = nome;
            Materiale = materiale;
            Prezzo_prod = prezzo_prod;
            Prezzo_vend = prezzo_vend;
        }

 
}

class FabbricaGiocattoli{

    private List<Giocattoli> giocattoli_prodotti = new List<Giocattoli>();

    public void add_giocattoli(Giocattoli giocattolo){
        giocattoli_prodotti.Add(giocattolo);
    }

    public void lista_giocattoli(){
        foreach(Giocattoli g in giocattoli_prodotti){
            Console.WriteLine($"[nome: {g.Nome}, materiale: {g.Materiale}, prezzo di vendita:{g.Prezzo_vend}]");
        }

    }

    public decimal prezzo_tot(){

        decimal netto = 0m;
        foreach(Giocattoli g in giocattoli_prodotti){
            netto+= g.Prezzo_vend - g.Prezzo_prod;
        }
        return netto;

    }
}

class Principale {
    static void Main(string[] args){
       Giocattoli bambola = new Giocattoli("bambola","plastica",20.0m,50.0m);

       FabbricaGiocattoli fabbrica = new FabbricaGiocattoli();

       fabbrica.add_giocattoli(bambola);
       fabbrica.lista_giocattoli();
       fabbrica.prezzo_tot();
    }
}
