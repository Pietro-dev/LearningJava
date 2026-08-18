package NivelFacil.Condicoes;

import java.util.Scanner;

public class Ternarios {
    static void main() {

        // ternários são maneiras de diminuir o código
        // variavel = (condição) ? valorSeVerdadeiro : valor se falso

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        String parOuImpar = (num%2 ==0) ? "O número que você escolheu é par!" : "O número quer você escolheu é ímpar";
        System.out.println("parOuImpar = " + parOuImpar);

        sc.close();

    }
}
