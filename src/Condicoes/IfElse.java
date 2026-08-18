package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String casa = "Atreides";
        String posicao;
        int idade = 500;
        Long patrimonio = 75000000L;
        boolean grandeCasa = false;


        //subir a hierarquia da casa com base no patrimonio

        if (patrimonio <= 250000000L && idade <= 250) {
            System.out.println("Posição: Grande Casa");
        }else if(patrimonio >= 750000000L && idade >= 500) {
            System.out.println("Posição: Casa Imperial");
        }else{
            System.out.println("Posição: Pequena Casa");
        }




    }
}
