package NivelIntermediario;

public class Harkonnen extends Personagem implements HabilidadeEspecial{
    public Harkonnen(String nome, String casa, String planeta, int idade) {
        super(nome, casa, planeta, idade);
    }

    public Harkonnen(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public Harkonnen() {
    }

    @Override
    public void bordao(){
        System.out.println("Meu deserto. Minha Arrakis. Minha duna.");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade Harkonnen!");
    }
}
