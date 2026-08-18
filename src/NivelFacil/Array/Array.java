package NivelFacil.Array;

public class Array {
    static void main(String[] args) {
        // Arrays são variáveis de referência.
        String[] nomes = new String[4];
        nomes[0] = "Chani";
        nomes[1] = "Stilgar";
        nomes[2] = "Duncan";

        System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2] + " " + nomes[3]);

        int[] num = new int[1];
        System.out.println(num[0]);

        boolean[] boo = new boolean[1];
        System.out.println(boo[0]);

        double[] dou = new double[1];
        System.out.println(dou[0]);
        //retorna o endereço da memória que esse array está referenciando.
        System.out.println(dou);
    }
}
