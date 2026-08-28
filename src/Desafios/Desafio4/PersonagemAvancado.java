package Desafios.Desafio4;

public class PersonagemAvancado extends PesonagemPadrao implements Personagem{
    private String especialidade;

    public PersonagemAvancado() {
    }

    public PersonagemAvancado(String nome, int idade, TipoHabilidade habilidade) {
        super(nome, idade, habilidade);
    }

    public PersonagemAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Mostrando informaçoes do personagem avançado");
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Executando habilidade avançada!");
    }


}
