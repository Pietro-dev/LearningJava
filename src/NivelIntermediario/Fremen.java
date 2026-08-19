package NivelIntermediario;

public class Fremen extends Personagem implements HabilidadeEspecial{
    public Fremen() {
    }

    public Fremen(String nome, String familia, String planetaNatal, int idade) {
        super(nome, familia, planetaNatal, idade);
    }

    public Fremen(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public void bordao(){
        System.out.println("Bi-la kaifa!");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade Fremen!");
    }
}
