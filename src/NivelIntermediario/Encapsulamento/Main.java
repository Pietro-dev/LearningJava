package NivelIntermediario.Encapsulamento;

public class Main {
    static void main(String[] args) {
        System.out.println("========== Leto Atreides ==========");
        Atreides leto = new Atreides("Leto", "Atreides", 50);
        System.out.println(leto.getNome() +" " + leto.getCasa() +" "+ leto.getIdade());
    }
}
