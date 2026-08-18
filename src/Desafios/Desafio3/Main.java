package Desafios.Desafio3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Atreides[] atreides = new Atreides[3];
        Scanner sc = new Scanner(System.in);
        int personagensCadastrados = 0;
        int opcao = 0;

        Atreides paulAtreides = new Atreides();
        paulAtreides.habilidadeEspecial = "Enxergar caminhos do futuro";
        paulAtreides.idade = 25;
        paulAtreides.nivelDificuldade = "A";
        paulAtreides.missao = "Libertar os fremen";
        paulAtreides.statusMissao = "Em andamento";
        paulAtreides.nome = "Paul Atreides";

        atreides[0] = paulAtreides;
        personagensCadastrados++;

//        paulAtreides.MostrarHabilidadeEspecial();
//        paulAtreides.MostrarInformacoes();
        while (opcao != 4){
            System.out.println("1 - exibir informações de todos os personagens");
            System.out.println("2 - adicionar um novo personagem");
            System.out.println("3 - atualizar habilidade de um personagem");
            System.out.println("4 - sair");
            System.out.println(atreides[0].nome);
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    for(int i = 0; i < personagensCadastrados; i++){
                        atreides[i].MostrarInformacoes();
                        System.out.println();
                    }
                    break;
                case 2:
                    Atreides novoAtreides = new Atreides();
                    System.out.println("Insira o nome do personagem: ");
                    novoAtreides.nome = sc.nextLine();
                    System.out.println("Insira a idade: ");
                    novoAtreides.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Insira a missão: ");
                    novoAtreides.missao = sc.nextLine();
                    System.out.println("Insira a nivel dificuldade da missão: ");
                    novoAtreides.nivelDificuldade = sc.nextLine();
                    System.out.println("Insira o status da missão: ");
                    novoAtreides.statusMissao = sc.nextLine();
                    System.out.println("Insira a habilidade especial: ");
                    novoAtreides.habilidadeEspecial = sc.nextLine();
                    atreides[personagensCadastrados] = novoAtreides;
                    personagensCadastrados++;
                    break;
                case 3:
                    System.out.println("Insira o nome do personagem que deseja atualizar: ");

                    String personagemParaAtualizar = sc.nextLine();
                    System.out.println("O personagem atualizado será: " + personagemParaAtualizar);

                    for(int i = 0; i < personagensCadastrados; i++){
                        if (atreides[i].nome.equals(personagemParaAtualizar)){
                            System.out.println("Insira a nova habilidade do personagem: ");
                            String novaHabilidade = sc.nextLine();
                            atreides[i].habilidadeEspecial = novaHabilidade;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Saindo da aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }


    }
}
