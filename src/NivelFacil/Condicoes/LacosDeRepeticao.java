package NivelFacil.Condicoes;

import java.time.LocalTime;

public class LacosDeRepeticao {
    static void main(String[] args) {
        //laços de repetição

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 50;

        LocalTime horarioInicioLoop =LocalTime.now();

        while(numeroDeClones < numeroMaximoDeClones){
            System.out.println("Clonando!");
            numeroDeClones++;
        }

        LocalTime horarioFimLoop = LocalTime.now();

        int tempoExecucao = horarioFimLoop.getSecond() - horarioInicioLoop.getSecond();

        System.out.println(tempoExecucao);

        // FOR
        for(int i = 0; i <= numeroMaximoDeClones; i++){
            System.out.println("Clonando no FOR!");
        }

    }
}
