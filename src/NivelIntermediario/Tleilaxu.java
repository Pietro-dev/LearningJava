package NivelIntermediario;

public final class Tleilaxu {
    String nome;
    String planetaNatal;

    public Tleilaxu(String nome, String planetaNatal) {
        this.nome = nome;
        this.planetaNatal = planetaNatal;
    }

    @Override
    public String toString(){
        return nome + ", " + planetaNatal;
    }
}
