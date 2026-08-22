package NivelIntermediario.Enums;

public enum GrandeCasa {
    ATREIDES("Casa nobre de tradição, honra e liderança.", "Caladan"),
    HARKONNEN("Casa conhecida por sua brutalidade, ambição e rivalidade histórica com os Atreides.", "Giedi Prime"),
    CORRINO("Casa Imperial que governou o Império por milênios.", "Kaitain"),
    FENRING("Casa associada ao Conde Hasimir Fenring, aliado próximo do Imperador.", "Desconhecido"),
    GINAZ("Casa famosa pela tradição dos Mestres Espadachins de Ginaz.", "Ginaz"),
    HALLECK("Família de Gurney Halleck, célebre guerreiro e servidor dos Atreides.", "Desconhecido"),
    METULLI("Casa nobre menor, com poucas informações conhecidas no universo de Duna.", "Desconhecido"),
    MORITANI("Casa nobre envolvida em antigas rivalidades e conflitos do Landsraad.", "Grumman"),
    NOVEBRUS("Casa nobre menor, pouco documentada no universo de Duna.", "Desconhecido"),
    STEEL("Casa nobre menor, com informações limitadas sobre sua história e origem.", "Desconhecido");

    private String descricaoCasa;
    private String planetaNatal;

    GrandeCasa(String descricaoCasa, String planetaNatal) {
        this.descricaoCasa = descricaoCasa;
        this.planetaNatal = planetaNatal;
    }
}
