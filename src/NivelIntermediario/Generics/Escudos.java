package NivelIntermediario.Generics;

public class Escudos {
    private String nome;

    public Escudos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: " + nome;
    }
}
