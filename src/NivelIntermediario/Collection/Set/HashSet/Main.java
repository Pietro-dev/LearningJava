package NivelIntermediario.Collection.Set.HashSet;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<String> pessoas = new ArrayList<String>();

        pessoas.add("Stilgar");
        pessoas.add("Gurney Halleck");
        pessoas.add("Leto Atreides");
        pessoas.add("Stilgar");
        System.out.println(pessoas);

        Set<String> pessoasSet = new HashSet<>();

        pessoasSet.addAll(pessoas);

        pessoasSet.remove("Gurney Halleck");
        System.out.println(pessoasSet);



    }
}
