package NivelIntermediario;

public class Corrino extends Personagem {
    //Construtores
    public Corrino(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public Corrino(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    @Override
    public void bordao(){
        System.out.println("Pelo imperador!");
    }
}
