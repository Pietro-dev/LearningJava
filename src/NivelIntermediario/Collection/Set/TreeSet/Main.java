package NivelIntermediario.Collection.Set.TreeSet;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<String> pessoas = new ArrayList<String>();

        pessoas.add("Stilgar");
        pessoas.add("Gurney Halleck");
        pessoas.add("Leto Atreides");
        pessoas.add("Stilgar");
        System.out.println(pessoas);

        Set<String> pessoasSet = new TreeSet<>();

        pessoasSet.addAll(pessoas);

        System.out.println(pessoasSet);



    }
}
