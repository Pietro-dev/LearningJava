package Desafios.Desafio3;

public class Personagem {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void MostrarInformacoes(){
        System.out.println("Nome: " + nome + ", idade: " + idade + ", missao: " + missao + ", nivel: " +  nivelDificuldade + ", status: " + statusMissao);
    }
}
