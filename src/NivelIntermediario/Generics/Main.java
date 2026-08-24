package NivelIntermediario.Generics;

public class Main {
    static void main(String[] args) {
        Escudos escudo = new Escudos("Escudo");
        Trajestilador traj = new Trajestilador("Trajestilador");

        BolsaGenerica<Object> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(escudo);
        bolsaGenerica.adicionarEquipamentos(traj);

        bolsaGenerica.mostrarEquipamentos();
    }
}
