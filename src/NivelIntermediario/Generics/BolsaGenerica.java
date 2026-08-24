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

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa" + equipamentos.toString();
    }
}
