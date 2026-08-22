package NivelIntermediario.Encapsulamento;

public abstract class Personagem {
    private String nome;
    private String casa;
    private int idade;

    // construtores
    public Personagem(String nome, String casa, int idade) {
        this.nome = nome;
        this.casa = casa;
        this.idade = idade;
    }

    public Personagem() {
    }

    // getters e setters
    // nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // casa
    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    // idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
