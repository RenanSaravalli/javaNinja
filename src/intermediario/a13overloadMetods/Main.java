package intermediario.a13overloadMetods;

import intermediario.a17finalClasses.Anbu;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 18, 2, NivelNinja.CHUUNIN);
        naruto.habilidadeEspecial();
        naruto.mostrarRankNinja();
        naruto.tacarKunai();

        System.out.println(" ");
        System.out.println("Um atributo Final");
        System.out.println(naruto.poder);

        System.out.println(" ");

        // Criando um objeto a partir da classe final
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Anbu aleatório";
        System.out.println(ninjaAnbu.nome);
    }
}
