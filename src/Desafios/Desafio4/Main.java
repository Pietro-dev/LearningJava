package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        PersonagemBasico pb = new PersonagemBasico("Pietro", 23, TipoHabilidade.AGUA);

        PersonagemAvancado pa = new PersonagemAvancado("Maria", 28, TipoHabilidade.FOGO, "longa distância");

        pb.mostrarInformacoes();
        pa.mostrarInformacoes();

        pb.executarHabilidade();
        pa.executarHabilidade();


    }
}
