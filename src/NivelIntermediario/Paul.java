package NivelIntermediario;

public class Paul extends Atreides implements HabilidadesBeneGesserit, Precognicao {

    // construtores
    public Paul(String nome, String planetaNatal, String casa, int idade, int numeroDeAbates, StatusSocial statusSocial) {
        super(nome, planetaNatal, casa, idade, numeroDeAbates, statusSocial);
    }

    public Paul(String nome, String planetaNatal, String casa, int idade) {
        super(nome, planetaNatal, casa, idade);
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

    @Override
    public void usarAVoz() {
        System.out.println("Usando a voz...");
    }

    @Override
    public void preverFuturo() {
        System.out.println("Prevendo o futuro...");
    }

    @Override
    public void bordao() {
        System.out.println("I'm Paul Muadib Atreides, son of Leto Atreides, duke of Arrakis!");
    }
}
