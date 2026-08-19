package NivelIntermediario;

public class Fremen extends PersonagemDuna implements HabilidadeEspecial{
    public Fremen() {
    }

    public Fremen(String nome, String familia, String planetaNatal, int idade) {

    }

    public void bordao(){
        System.out.println("Bi-la kaifa!");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade Fremen!");
    }
}
