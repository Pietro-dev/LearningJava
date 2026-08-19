package NivelIntermediario;

public class Main {
    static void main(String[] args) {

        // Personagem 1 - Objeto Atreides
        Atreides letoAtreides = new Atreides("Leto Atreides", "Caladan", "Atreides", 58);
//        letoAtreides.Bordao();
//        letoAtreides.habilidadeEspecial();

        // Personagem 2 - Objeto Fremen
        Fremen Stilgar = new Fremen("Stilgar", "Fremen", "Arrakis", 48);
        //Stilgar.Bordao();

        // Personagem 3 - Objeto Harkonnen
        Harkonnen FeydRautha = new Harkonnen("Feyd Rautha", "Harkonnen", "Giedi Prime", 28);
        //FeydRautha.BordaoHarkonnen();
        //FeydRautha.habilidadeEspecial();

        // Personagem 4 - Objeto Paul (AtreidesHarkonnen)
        Paul paul = new Paul("Paul Atreides", "Atreides", "Caladan", 25);
        // paul.habilidadeEspecial();
        paul.alterarFuturo(99);
        paul.alterarFuturo();

        // Personagem 5 - Objeto Corrino
        Corrino princesaIrulan = new Corrino("Princesa Irulan", "Corrino", "Kaitan", 23);
//        princesaIrulan.mostrarPersonagem();
//        princesaIrulan.bordao();

        // Personagem 6 - Objeto Bene Gesserit
        BeneGesserit ladyJessica = new BeneGesserit("Lady Jessica", "Wallach IX", "Atreides", 33);
//        ladyJessica.mostrarPersonagem();
//        ladyJessica.bordao();

        // Personagem 7 - Objeto Atreides
        Atreides duncanIdaho = new Atreides("Duncan Idaho", "Caladan", "Atreides", 30, 10000, StatusSocial.SOLDADO);
//        duncanIdaho.mostrarPersonagem();
//        duncanIdaho.bordao();
    }
}
