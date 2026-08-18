package NivelFacil.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    static void main() {
        Scanner sc = new Scanner(System.in);

        /*
         * Pedir para o usuário escolher entre os personagens.
         */
        String personagem1 = "Paul Atreides";
        String personagem2 = "Leto Atreides";
        String personagem3 = "Lady Jessica";

        //Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - " + personagem1);
        System.out.println("2 - "+personagem2);
        System.out.println("3 - "+personagem3);


        // pedir para o usuário escolher o usuário
        int personagemEscolhido = sc.nextInt();

        System.out.println("Você escolheu o número: "+ personagemEscolhido);

        switch (personagemEscolhido) {
            case 1:
                System.out.println("O personagem escolhido foi: "+personagem1);
                break;
            case 2:
                System.out.println("O personagem escolhido foi: "+personagem2);
                break;
            case 3:
                System.out.println("O personagem escolhido foi: "+personagem3);
                break;
            default:
                System.out.println("Opção não disponível! Tente novamente.");
        }

        sc.close();
    }
}
