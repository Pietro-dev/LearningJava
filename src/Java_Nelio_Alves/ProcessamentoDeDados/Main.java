package Java_Nelio_Alves.ProcessamentoDeDados;

public class Main {
    static void main(String[] args) {
        /*
        * O processamento de dados é feito pelo sinal de atribuição
        * o sinal = (igual)
        * EX:
         */
        
        int x;

        double y;
        
        x = 5;
        y = 2 * x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

//        EX 2:

        double baseMenor, baseMaior, altura, area;

//      é uma boa prática sempre indicar o tipo do número que se está utilizando. Neste caso, o .0 indica que é um double
        baseMenor = 6.0;
        baseMaior = 8.0;
        altura = 5.0;

        area = ((baseMenor + baseMaior) / 2) * altura;

        System.out.println(area);

//        EX 3 COM CASTING (conversão explícita de valores)
        int a, b;
        double resultado;
        
        a = 5;
        b = 2;
        
        // sem casting
        resultado = a / b;
        System.out.println("resultado = " + resultado);
        
        // com casting 
        resultado = (double) a/b;
        System.out.println("resultado = " + resultado);

        // EX 3.2

        double c;
        int d;

        c = 5.0;
        d = (int) c;

        System.out.println("d = " + d);
    }
}
