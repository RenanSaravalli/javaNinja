package intermediario.a22exemplo1Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
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

    // Colocando os equimamentos genéricos na bolsa genérica
    public void adicionarEquipamentos(T equipamentosGenericos) {
        equipamentos.add(equipamentosGenericos);
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
