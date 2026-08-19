package NivelIntermediario;

public class Harkonnen extends PersonagemDuna implements HabilidadeEspecial{
    public Harkonnen(String nome, String casa, String planeta, int idade) {}

    public Harkonnen() {
    }

    public void bordao(){
        System.out.println("Meu deserto. Minha Arrakis. Minha duna.");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade Harkonnen!");
    }
}
