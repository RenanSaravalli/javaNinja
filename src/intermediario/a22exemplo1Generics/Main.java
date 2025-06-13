package intermediario.a22exemplo1Generics;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja equipamentosNinja = new EquipamentosNinja("Kunai");
        EquipamentosNinja equipamentosNinja1 = new EquipamentosNinja("Shuriken");
        EquipamentosNinja espada = new EquipamentosNinja("Espada");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        bolsaGenerica.adicionarEquipamentos(equipamentosNinja);
        bolsaGenerica.adicionarEquipamentos(equipamentosNinja1);
        bolsaGenerica.adicionarEquipamentos(espada);
        bolsaGenerica.adicionarEquipamentos(pergaminho);
        System.out.println(bolsaGenerica);


    }
}
