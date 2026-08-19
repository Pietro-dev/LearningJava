package NivelIntermediario;

public class Paul extends Atreides implements HabilidadesBeneGesserit, Precognicao {

    public Paul(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public void usarAVoz() {
        System.out.println("Usando a voz...");
    }

    @Override
    public void preverFuturo() {
        System.out.println("Prevendo o futuro...");
    }
}
