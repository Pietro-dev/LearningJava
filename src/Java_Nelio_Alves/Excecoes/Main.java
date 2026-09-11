package Java_Nelio_Alves.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("====== Method 1 ======");
        method2();
        System.out.println("====== End of Method 1 ======");
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("====== Method 2 ======");
            String [] vet = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vet[position]);

            // exceção de posição inválida, posição maior que o tamanho do array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
//            rastreia a pilha de chamadas que gerou a exceção.
//            e.printStackTrace();
            sc.next();

//        Exceção de entrada inválida. A entrada não é um número inteiro.
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("====== End of Method 2 ======");
    }
}
