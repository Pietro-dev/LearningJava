package NivelIntermediario;

public class PersonagemDuna {
    String nome;
    String planetaNatal;
    String casa;
    int idade;

    // criar um metodo publico personalizado
    public void DizerNomeEPlaneta(){
        System.out.println("I'm " + nome + " from " + planetaNatal);
    }

    public String EuSou(){
        return "I'm " + nome;
    }
}
