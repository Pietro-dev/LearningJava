package NivelIntermediario;

public class Main {
    static void main(String[] args) {

        // Personagem 1 - Objeto Atreides
        Atreides letoAtreides = new Atreides("Leto Atreides", "Caladan", "Atreides", 58);
        letoAtreides.bordao();
        letoAtreides.habilidadeEspecial();

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 2 - Objeto Fremen
        Fremen Stilgar = new Fremen("Stilgar", "Fremen", "Arrakis", 48);
        Stilgar.bordao();
        System.out.println(Stilgar.toString());

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 3 - Objeto Harkonnen
        Harkonnen FeydRautha = new Harkonnen("Feyd Rautha", "Harkonnen", "Giedi Prime", 28);
        FeydRautha.bordao();
        FeydRautha.habilidadeEspecial();

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 4 - Objeto Paul (AtreidesHarkonnen)
        Paul paul = new Paul("Paul Atreides", "Atreides", "Caladan", 25);
        paul.habilidadeEspecial();
        paul.alterarFuturo(99);
        paul.alterarFuturo();

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 5 - Objeto Corrino
        Corrino princesaIrulan = new Corrino("Princesa Irulan", "Corrino", "Kaitan", 23);
        System.out.println(princesaIrulan.toString());
        princesaIrulan.bordao();

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 6 - Objeto Bene Gesserit
        BeneGesserit ladyJessica = new BeneGesserit("Lady Jessica", "Wallach IX", "Atreides", 33);
        System.out.println(ladyJessica.toString());
        ladyJessica.bordao();

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 7 - Objeto Atreides
        Atreides duncanIdaho = new Atreides("Duncan Idaho", "Caladan", "Atreides", 30, 10000, StatusSocial.SOLDADO);
        duncanIdaho.bordao();
        System.out.println(duncanIdaho.toString());

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 8 - Final Tleilaxu
        Tleilaxu scytale = new Tleilaxu("Scytale", "Tleilax");
        System.out.println(scytale.toString());

        System.out.println("\n--------------------------------------------------\n");

        // Personagem 9 - Fremen com enum Sietch
        Fremen chani = new Fremen("Chani", "Arrakis", "Fremen", 20, 150, StatusSocial.SOLDADO, SietchFremen.SIETCH_TABR);
    }

}
