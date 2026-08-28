package Desafios.Desafio6;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        // criar linked list
        LinkedList<Personagem> ll = new LinkedList<>();

        // adicionar elementos na linked list
        ll.add(new Personagem("Paul Atreides", 25, "Caladan"));
        ll.add(new Personagem("Duncan Idaho", 35, "Giedi Prime"));
        ll.add(new Personagem("Chani", 23, "Arrakis"));
        ll.add(new Personagem("Lady Jessica", 45, "Caladan"));
        ll.add(new Personagem("Stilgar", 50, "Arrakis"));
        ll.add(new Personagem("Gurney Halleck", 40, "Caladan"));
        ll.add(new Personagem("Feyd-Rautha", 30, "Giedi Prime"));

        // remover o primeiro elemento
        ll.removeFirst();

        // adicionar personagem no inicio
        ll.addFirst(new  Personagem("Marian", 25, "Caladan"));

        // ver um elemento específico
        System.out.println(ll.get(2).toString());

        // ver lista
        //System.out.println(ll);

        for(Personagem p : ll) {
            System.out.println(p.toString());
        }


    }
}
