package NivelIntermediario;

public abstract class Personagem implements HabilidadeEspecial {

    String nome;
    String planetaNatal;
    String casa;
    int idade;
    int numeroDeAbates;
    StatusSocial statusSocial;

    // All args constructor
    public Personagem(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        this(nome, planetaNatal, casa, idade);
        this.numeroDeAbates = numeroDeAbates;
        this.statusSocial = statusSocial;
    }

    public Personagem(String nome, String planetaNatal, String casa, int idade) {
        this.nome = nome;
        this.planetaNatal = planetaNatal;
        this.casa = casa;
        this.idade = idade;
    }

    // No args constructor
    public Personagem(){}

    public abstract void bordao();

    /*
    * Metodo:
    * Implementado da interface habilidade especial
    */
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade especial!");
    }

    // metodo final
    final void metodoFinal(){
        System.out.println("Este método não pode ser sobrescrito!");
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + ", Planeta Natal: " + planetaNatal + ", Casa: " + casa + ", Idade: " + idade + ", Número de abates: " + numeroDeAbates + ", Status social: " + statusSocial;
    }
}
