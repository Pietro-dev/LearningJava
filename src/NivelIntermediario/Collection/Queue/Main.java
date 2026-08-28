package NivelIntermediario.Collection.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args) {
        // Queue // filas
        Queue<Object> queue = new LinkedList<>();

        // adiciona elementos
        queue.add("Leto");
        queue.add("Pietro");
        queue.add("Jessica");
        queue.add("Paul");
        System.out.println(queue);

        // remove elementos
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

        // como ver o primeiro da fila
        System.out.println(queue.peek());

        //verificar se a fila está vazia
        if(queue.isEmpty()){
            System.out.println("A fila está vazia!");
        }

    }
}
