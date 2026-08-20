package NivelIntermediario;

public class Fremen extends Personagem implements HabilidadeEspecial{
    SietchFremen sietch;

    // construtores
    public Fremen(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial, SietchFremen sietch) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
        this.sietch = sietch;
    }

    public Fremen(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public Fremen(String nome, String familia, String planetaNatal, int idade) {
        super(nome, familia, planetaNatal, idade);
    }

    public Fremen() {
    }

    @Override
    public void bordao(){
        System.out.println("Bi-la kaifa!");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade Fremen!");
    }
}
