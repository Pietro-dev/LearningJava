package NivelIntermediario;

import Desafios.Desafio3.Personagem;

public abstract class PersonagemDuna implements HabilidadeEspecial {
    //TODO: Incluir 2 novos atributos: numerosDeAbates, nota

    String nome;
    String planetaNatal;
    String casa;
    int idade;

    public abstract void bordao();

    // metodo para mostrar personagem
    public void mostrarPersonagem(){
        System.out.println("Nome: "+ nome + " Planeta Natal: " + planetaNatal + " Casa: " + casa + " Idade: " + idade);
    }

    // metodo implementado da Interface Habilidade Especial
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é minha habilidade especial!");
    }

    // All args constructor
    public PersonagemDuna(String nome, String planetaNatal, String casa, int idade) {
        this.nome = nome;
        this.planetaNatal = planetaNatal;
        this.casa = casa;
        this.idade = idade;
    }

    // No args constructor
    public PersonagemDuna(){}
}
