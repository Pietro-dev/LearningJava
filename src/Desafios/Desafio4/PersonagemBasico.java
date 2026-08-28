package Desafios.Desafio4;

public class PersonagemBasico extends PesonagemPadrao implements Personagem {

    public PersonagemBasico() {
    }

    public PersonagemBasico(String nome, int idade, TipoHabilidade habilidade) {
        super(nome, idade, habilidade);
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Mostrando informações do personagem básico");
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando habilidade do personagem básico");
    }
}
