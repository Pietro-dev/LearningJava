package NivelIntermediario.Records;

public class Personagem {
    private final String nome;
    private final String email;
    private final int telefone;

    // contrutror all args
    public Personagem(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone;
    }
}
