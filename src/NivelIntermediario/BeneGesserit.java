package NivelIntermediario;

public class BeneGesserit extends Personagem implements HabilidadesBeneGesserit {

    public BeneGesserit(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public BeneGesserit(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    @Override
    public void bordao() {
        System.out.println("Eu não devo temer. O medo é o assassino da mente...");
    }


    @Override
    public void usarAVoz() {
        System.out.println("Usando a voz...");
    }
}
