package NivelIntermediario.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        // Array
        String[] personagensArray = new String[3];
        personagensArray[0] = "Paul";
        personagensArray[1] = "Leto";
        personagensArray[2] = "Jessiaca";
        System.out.println("Printando array: "+ personagensArray[0]);

        // Listas - não são estáticas
        List<String> personagensList = new ArrayList<String>();

        // adicionar na lista
        personagensList.add("Paul");
        personagensList.add("Leto");
        personagensList.add("Jessiaca");
        personagensList.add("Gurney");
        System.out.println("Printando lista: "+ personagensList);

        // remover da lista
        personagensList.remove("Gurney");
        System.out.println("personagensList = " + personagensList);

        // trocar elementos
        personagensList.set(2, "Lady Jessica");
        System.out.println("personagensList = " + personagensList);

        // ver tamanho da lista
        System.out.println("Tamanho da lista: " + personagensList.size());
    }
}
