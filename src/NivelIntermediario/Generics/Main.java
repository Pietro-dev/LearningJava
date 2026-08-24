package NivelIntermediario.Generics;

public class Main {
    static void main(String[] args) {
        Equipamentos escudo = new Equipamentos("Escudo");
        Equipamentos fremKit = new Equipamentos("Fremkit");
        Equipamentos radiofresa = new Equipamentos("Radiofresa");
        Equipamentos trajestilador = new Equipamentos("Trajestilador");

        BolsaGenerica<Equipamentos> bolsa = new BolsaGenerica<>();
        bolsa.adicionarEquipamentos(escudo);
        bolsa.adicionarEquipamentos(fremKit);
        bolsa.adicionarEquipamentos(radiofresa);
        bolsa.adicionarEquipamentos(trajestilador);

        System.out.println(bolsa);
    }
}
