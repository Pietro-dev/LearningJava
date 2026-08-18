package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args){
        /*
        * Dados não primitivos: String, array, class, enum
        * Variáveis não primitivas possuem métodos atrelados à ela
         */
        
        String nome = "Paul Atreides";
        String nomeToUppercase = nome.toUpperCase();

        System.out.println("nome = " + nome);
        System.out.println("nomeToUppercase = " + nomeToUppercase);

        String planetaNatal = "Caladan";
        String planetaToLowerCase = planetaNatal.toLowerCase();
        System.out.println("Planeta = " + planetaNatal);
        
    }
}
