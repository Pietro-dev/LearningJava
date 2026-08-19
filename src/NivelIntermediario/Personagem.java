package NivelIntermediario;

public abstract class Personagem implements HabilidadeEspecial {
    //TODO: Incluir 2 novos atributos: numerosDeAbates, statusSocial
    //TODO: RANK: Duque, Princesa, Imperador, Nobre, Soldado, Súdito

    String nome;
    String planetaNatal;
    String casa;
    int idade;
    int numeroDeAbates;
    StatusSocial statusSocial;

    public abstract void bordao();

    // metodo para mostrar personagem
    public void mostrarPersonagem(){
        System.out.println("Nome: "+ nome + ", Planeta Natal: " + planetaNatal + ", Casa: " + casa + ", Idade: " + idade + ", Número de abates: " + numeroDeAbates + ", Status social: " + statusSocial);
    }

    // metodo implementado da Interface Habilidade Especial
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade especial!");
    }

    // All args constructor
    public Personagem(String nome, String planetaNatal, String casa, int idade) {
        this.nome = nome;
        this.planetaNatal = planetaNatal;
        this.casa = casa;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos


    public Personagem(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        this(nome, planetaNatal, casa, idade);
        this.numeroDeAbates = numeroDeAbates;
        this.statusSocial = statusSocial;
    }

    // No args constructor
    public Personagem(){}
}
