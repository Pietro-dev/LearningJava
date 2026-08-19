package NivelIntermediario;

public class Paul extends Atreides implements HabilidadesBeneGesserit, Precognicao {

    public Paul(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public Paul(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public void usarAVoz() {
        System.out.println("Usando a voz...");
    }

    @Override
    public void preverFuturo() {
        System.out.println("Prevendo o futuro...");
    }
}
