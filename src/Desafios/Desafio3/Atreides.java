package Desafios.Desafio3;

public class Atreides extends Personagem{
    public String habilidadeEspecial;

    @Override
    public void MostrarInformacoes(){
        System.out.println("Nome: " + nome + ", idade: " + idade + ", missao: " + missao + ", nivel: " +  nivelDificuldade + ", status: " + statusMissao + ", habilidadeEspecial: " + habilidadeEspecial);
    }

    public void MostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

}
