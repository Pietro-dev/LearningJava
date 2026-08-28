package NivelIntermediario.Collection.List.LinkedList;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Paul");
        list.add("Leto");
        list.add("Jessica");

        System.out.println(list);

        list.add("Gurney");
        list.add(2, "Stilgar");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);


    }

}
