package NivelIntermediario.Collection.List.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        // array
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers.length);

        // Lista
        List<String> nomes = new ArrayList<>();

        nomes.add("Paul Atreides");
        nomes.add("Leto");
        nomes.add("Jessica");

        nomes.remove("Paul Atreides");

        nomes.set(1, "Leto Atreides");

        nomes.size();


        // Stack
        // O último elemento a entrar é o primeiro a sair
        Stack<String> stack = new Stack<>();

        stack.push("Leto");
        stack.push("Paul");
        stack.push("Jessica");

        System.out.println("stack = " + stack + "\nstack size = " + stack.size());

        stack.pop();
        System.out.println("stack = " + stack);

        System.out.println(stack.peek());

    }
}
