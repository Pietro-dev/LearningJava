package NivelIntermediario.Enums;

public class Main {
    static void main(String[] args) {
        Personagem feydRautha = new Personagem("Feyd Rautha", GrandeCasa.HARKONNEN);
        Personagem condFenring = new Personagem("Conde Fenring", GrandeCasa.FENRING);

        System.out.println(condFenring.toString());
    }
}
