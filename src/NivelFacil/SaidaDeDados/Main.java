package NivelFacil.SaidaDeDados;

import java.util.Locale;

public class Main {
    static void main(String[] args) {
        double x = 10.354678;

        IO.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //define a localização do aplicativo
//        Locale.setDefault(Locale.US);
        // agora o separador de casas decimais é o ponto
        System.out.printf("%.3f%n", x);

        String nome = "Pietro";
        int idade = 23;
        double renda = 4000.0;

        // interpolação de strings
        System.out.printf("O %s tem %d e recebe %.2f%n", nome, idade, renda);

        System.out.printf("Resultado: %.3f%n", x);

        // Exercício de fixação
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 620.50;
        double measure = 53.234567;

//        Locale.setDefault(Locale.US);

        System.out.printf("Products: %n%s, which price is %.2f%n %s, which price is %.2f%n%n Record: %d years old, code %d and gender: %s%n%n Measue with eight decimal places: %f%n Rouded (three decimal places): %.3f%n US decimal point: %.3f", product1, price1, product2, price2, age, code, gender, measure, measure, measure);
    }
}
