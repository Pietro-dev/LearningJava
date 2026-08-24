package NivelIntermediario.Generics;

public class Trajestilador {
    private String nome;

    public Trajestilador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }

    // getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
