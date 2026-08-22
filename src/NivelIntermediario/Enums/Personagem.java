package NivelIntermediario.Enums;

public class Personagem {
    private String nome;
    private GrandeCasa grandeCasa;

    // metodo para mostrar mais informaões
    @Override
    public String toString() {
        return "Nome: " + nome + "\nGrande Casa: " + grandeCasa;
    }

    // contrutores
    public Personagem(String nome, GrandeCasa grandeCasa) {
        this.nome = nome;
        this.grandeCasa = grandeCasa;
    }

    public Personagem() {
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GrandeCasa getGrandeCasa() {
        return grandeCasa;
    }

    public void setGrandeCasa(GrandeCasa grandeCasa) {
        this.grandeCasa = grandeCasa;
    }
}
