package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
        *   Crie um programa que represente três ninjas da Vila
            da Folha (Konoha) de "Naruto" e suas respectivas
            missões.
            Cada ninja tem um nome, uma idade e uma missão
            atribuída a ele, com o nome da missão, nível de
            dificuldade e status de conclusão
         */

        String nome1 = "Paul Atreides";
        int idade1 = 14;
        String missao1 = "Se tornar o Kwisatz Haderach";
        int nivelDificuldade1 = 10;
        boolean statusConclusao1 = false;

        if (idade1 < 15 &&  nivelDificuldade1 <= 5) {
            statusConclusao1 = true;
        } else if (idade1 > 15 && nivelDificuldade1 > 5){
            statusConclusao1 = true;

        }
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missao: " + missao1);
        System.out.println("Nivel dificuldade: " + nivelDificuldade1);
        System.out.println("StatusConclusao1: " + statusConclusao1);

        String nome2 = "Lady Jessica";
        int idade2 = 35;
        String missao2 = "Propagar a profecia sobre Paul ser o messias";
        int nivelDificuldade2 = 7;
        boolean statusConclusao2 = false;

        if (idade2 < 15 &&  nivelDificuldade2 <= 5) {
            statusConclusao2 = true;
        } else if (idade2 > 15 && nivelDificuldade2 > 5){
            statusConclusao2 = true;

        }
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nivel dificuldade: " + nivelDificuldade2);
        System.out.println("StatusConclusao2: " + statusConclusao2);





        String nome3 = "Duncan Idaho";
        int idade3 = 45;
        String missao3 = "Treinar Paul Atreides";
        int nivelDificuldade3 = 6;
        boolean statusConclusao3 = false;

        if (idade3 < 15 &&  nivelDificuldade3 <= 5) {
            statusConclusao3 = true;
        } else if (idade3 > 15 && nivelDificuldade3 > 5){
            statusConclusao3 = true;

        }
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Nivel dificuldade: " + nivelDificuldade3);
        System.out.println("StatusConclusao3: " + statusConclusao3);

    }
}
