package NivelIntermediario;

public class BeneGesserit extends PersonagemDuna implements HabilidadesBeneGesserit {

    public BeneGesserit(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
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
