package NivelFacil.Desafios;

import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pessoas = new String[10];
        int pessoasCadastradas = 0;
        int opcaoEscolhida = 0;

        while(opcaoEscolhida != 3){
            System.out.println("Sistema de Cadastro de Pessoas.");
            System.out.println("1 - Listar pessoas cadastradas");
            System.out.println("2 - Cadastrar pessoas");
            System.out.println("3 - Sair");
            System.out.println("Selecione uma opção: ");

            opcaoEscolhida =  input.nextInt();
            //esse nextLine é necessário para consumir o aperto da tecla enter
            input.nextLine();

            switch(opcaoEscolhida){
                case 1:
                    if(pessoasCadastradas == 0){
                        System.out.println("Não há pessoas cadastradas");
                    } else {
                        for (int i = 0; i < pessoasCadastradas; i++) {
                            System.out.println(pessoas[i]);
                        }
                    }
                    break;
                case 2:
                    if(pessoasCadastradas < 10){
                        System.out.println("Insira o nome da pessoa: ");
                        String novaPessoa = input.nextLine();

                        pessoas[pessoasCadastradas] = novaPessoa;
                        pessoasCadastradas++;
                    }else {
                        System.out.println("O número máximo de pessoas já foi cadastrado.");
                    }

                    break;
                case 3:
                    System.out.println("Encerrando aplicação!");
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }
}
