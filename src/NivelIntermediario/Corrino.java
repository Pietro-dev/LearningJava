package NivelIntermediario;

public class Corrino extends Personagem {
    public void bordao(){
        System.out.println("Pelo imperador!");
    }

    public Corrino(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public Corrino(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }
}
