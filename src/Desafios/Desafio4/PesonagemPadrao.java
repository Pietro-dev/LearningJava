package Desafios.Desafio4;

public abstract class PesonagemPadrao {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;

    public PesonagemPadrao() {
    }

    public PesonagemPadrao(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


}
