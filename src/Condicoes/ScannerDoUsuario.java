package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    static void main() {
        /*
         * Scanner traz o usuário para dentro da aplicação
         * O usuário vai criar um personagem e vamos validar os dados
         */

        Scanner sc = new Scanner(System.in);

        //Receber nome
        System.out.print("Digite o nome do personagem: ");
        String nomeDoPersonagem = sc.nextLine();
        System.out.println("Nome do personagem = " + nomeDoPersonagem);

        //Receber idade
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.println("idade = " + idade);

        //Tratamendo de dados
        if(idade>18){
            System.out.println("Seu personagem é maior de 18 anos");
        }else {
            System.out.println("Seu personagem é menor de 18 anos");
        }

        sc.close();
    }
}
