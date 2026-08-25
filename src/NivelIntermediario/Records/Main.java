package NivelIntermediario.Records;

public class Main {
    static void main(String[] args) {
        // Criando personagem com classe normal
        Personagem personagem = new Personagem("Paul Atreides", "paul@email.com", 1123456543);
        System.out.println(personagem.toString());

        // criando personagem com record
        PersonagemRecord personagemRecord = new PersonagemRecord("Leto", "leto@email.com", 999999999);
        System.out.println(personagemRecord.toString());
    }
}
