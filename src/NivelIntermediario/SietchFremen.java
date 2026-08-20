package NivelIntermediario;

public enum SietchFremen {

    SIETCH_TABR("Sul de Arrakis", 50000, "Conhecidos por montar em vermes"),
    SITCH_TAKR("Norte de Arrakis", 3000, "Especialistas em combate corpo a corpo"),
    SITCH_KINJAL("Região do Cinturão", 2000, "Mestres da sobrevivência no deserto"),
    SITCH_RED("Cercanias de Carthag", 1500, "Músicos e poetas guerreiros");

    String regiao;
    int populacao;
    String fama;

    SietchFremen(String regiao, int populacao, String fama) {
        this.regiao = regiao;
        this.populacao = populacao;
        this.fama = fama;
    }

    SietchFremen() {
    }
}
