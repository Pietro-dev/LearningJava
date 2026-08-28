package Desafios.Desafio6;

public class Personagem {
    private String nome;
    private int idade;
    private String planeta;

    public Personagem(String nome, int idade, String planeta) {
        this.nome = nome;
        this.idade = idade;
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " - " + planeta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
}
