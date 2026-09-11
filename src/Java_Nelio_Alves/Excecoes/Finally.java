package Java_Nelio_Alves.Excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
    static void main(String[] args) {
        File file = new File("arquivo.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e ) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco finally executado.");
        }
    }
}
