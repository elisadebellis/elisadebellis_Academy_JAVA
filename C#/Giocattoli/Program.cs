using System;
class Giocattoli{
       

        public string nome {get; set};
        public string materiale {get; set};
        public decimal prezzo_prod {get; set};
        public decimal prezzo_vend {get; set};

        public Giocattoli(string nome,string materiale, decimal prezzo_prod, decimal prezzo_vend){
            nome = nome;
            materiale = materiale;
            prezzo_prod = prezzo_prod;
            prezzo_vend = prezzo_vend;
        }

 
}

class FabbricaGiocattoli{

    private List<Giocattoli> giocattoli_prodotti = new List<Giocattoli>();

    public void add_giocattoli(Giocattoli giocattoli){
        giocattoli_prodotti.Add(giocattoli);
    }

    public void lista_giocattoli(){
        foreach(Giocattoli g in giocattoli_prodotti){
            Console.WriteLine($"[nome: {g.nome}, materiale: {g.materiale}, prezzo di vendita:{g.prezzo_vend}]");
        }

    }

    public decimal prezzo_tot(){

        decimal netto = 0m;
        foreach(Giocattoli g in giocattoli_prodotti){
            netto+= g.prezzo_vend - g.prezzo_prod;
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
