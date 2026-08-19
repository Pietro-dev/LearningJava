package NivelIntermediario;

public class Atreides extends PersonagemDuna{

    // construtores
    public Atreides(String nome, String planetaNatal, String casa, int idade){
        super(nome, planetaNatal, casa, idade);
    }

    public Atreides() {
        super();
    }

    // métodos
    public void bordao(){
        System.out.println("Aqui estou, aqui permaneço!");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade Atreide!");
    }
}
