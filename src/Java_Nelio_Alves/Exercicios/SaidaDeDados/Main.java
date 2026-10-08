package Java_Nelio_Alves.Exercicios.SaidaDeDados;

import java.util.Locale;

public class Main {
    static void main(String[] args) {
        String produto1 = "Computer";
        String produto2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n" +
                "%s, which price is %.2f %n" +
                "%s, which price is %.2f %n" +
                "%n" +
                "Record: %d years old, code %d and gender: %s %n" +
                "%n" +
                "Measue with eight decimal places: %.8f %n" +
                "Rouded (three decimal places): %.3f%n", produto1, price1, produto2, price2, age, code, gender, measure, measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
