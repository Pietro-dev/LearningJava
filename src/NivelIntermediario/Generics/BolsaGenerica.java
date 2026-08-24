package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos = new ArrayList<>();

    //adicionar equipamentos genéricos
    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    //construtores
    public BolsaGenerica() {
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //mostrar equipamentos
    public void mostrarEquipamentos(){
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }

    @Override
    public String toString() {
        return "Bolsa" + equipamentos.toString();
    }
}
