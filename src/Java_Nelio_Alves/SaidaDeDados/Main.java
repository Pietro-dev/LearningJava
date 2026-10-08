package Java_Nelio_Alves.SaidaDeDados;

import java.util.Locale;

public class Main {
    static void main(String[] args) {
        int y = 32;
        double x = 10.34784;

        System.out.println("Bom dia!");

        System.out.println(y);

        /*
        * para formatar a saida de dados usa-se o printf
        * para formatar a quantidade de casas decimais, usamos %.2f
        * o 2 indica a quantidade de casas decimais que vamos exibir
        */
        System.out.println(x);
        System.out.printf("%.2f\n", x);

        /*
        * por padrão, o printf usa o separador de casas decimais
        * equivalente ao idioma do computador
        * para mudar isso, usamos Locale.setDefault(Locale.<pais>)
        * ex:
        */

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);

//        CONCATENANDO ELEMENTOS

        System.out.println("Resultado = " + x + " metros");

        System.out.printf("Resultado = %.2f metros%n", x);

//        CONCATENANDO VÁRIOS ELEMENTOS
        /*
        * para concatenar vários elementos, devemos ter em mente os marcadores de cada tipo
        * ponto flutuante (float) = %f
        * inteiros = %d
        * string = %s
        * */

        String nome = "Pietro";
        int idade = 23;
        double renda = 50000.0;

        System.out.printf("%s tem %d anos e ganha %.2f reais", nome, idade, renda);
    }
}
