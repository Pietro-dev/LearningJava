package NivelIntermediario;

public class Main {
    static void main(String[] args) {

        // Personagem 1
        Atreides PaulAtreides = new Atreides();
        PaulAtreides.nome = "Leto Atreides";
        PaulAtreides.planetaNatal = "Caladan";
        PaulAtreides.casa = "Atreides";
        PaulAtreides.idade = 18;
        PaulAtreides.Bordao();

        // Personagem 2
        Fremen Stilgar = new Fremen();
        Stilgar.nome = "Stilgar";
        Stilgar.planetaNatal = "Arrakis";
        Stilgar.casa = "Fremen";
        Stilgar.idade = 45;
        Stilgar.Bordao();

        // Personagem 3
        Harkonnen FeydRautha = new Harkonnen();
        FeydRautha.nome = "Feyd Rautha";
        FeydRautha.planetaNatal = "Giedi Prime";
        FeydRautha.casa = "Harkonnen";
        FeydRautha.idade = 18;
        FeydRautha.BordaoHarkonnen();

        // Personagem 4
        Paul paul = new Paul();
        paul.nome = "Paul Atreides";
        paul.casa = "Atreides";
        paul.idade = 25;
        paul.Bordao();
        paul.EnxergarOFuturo();
        paul.EscolherCaminhoParaOFuturo();
        paul.planetaNatal = "Caladan";
    }
}
