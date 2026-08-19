package NivelIntermediario;

public class Paul extends Atreides implements HabilidadesBeneGesserit, Precognicao {

    public Paul(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
    }

    public Paul(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public void usarAVoz() {
        System.out.println("Usando a voz...");
    }

    public void preverFuturo() {
        System.out.println("Prevendo o futuro...");
    }

    //Sobrecarga de metodo
    @Override
    public void alterarFuturo() {
        System.out.println("Alterando o futuro...");
    }
    @Override
    public void alterarFuturo(int nivelPresciencia) {
        if(nivelPresciencia > 90){
            System.out.println("Sua capacidade de presciência é: " + nivelPresciencia + " suas habilidade de alterar o futuro são incríveis");
        }else{
            System.out.println("Sua capacidade de presciência é: " + nivelPresciencia + " você não pode alterar o futuro");
        }
    }
}
