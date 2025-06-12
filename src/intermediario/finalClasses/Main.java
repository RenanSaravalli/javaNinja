package intermediario.finalClasses;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Aldeia da folha", "Sasuke", 10, 2, NivelNinja.CHUUNIN);
        sasuke.nome = "Sasuke";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia Da Folha";
        sasuke.sharinganAtivado();
        sasuke.habilidadeEspecial();


        System.out.println(" ");


        Uchiha madara = new Uchiha("Aldeia da folha", "Madara", 20, 30, NivelNinja.KAGE);
        madara.sharinganAtivado();
        madara.mostrarRankNinja();
        madara.habilidadeEspecial();
        // Métod comum
        madara.inteligenciaDeCombate();
        // Métod sobrecarregado
        madara.inteligenciaDeCombate(20);

        System.out.println(" ");

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 18, 2, NivelNinja.CHUUNIN);
        naruto.habilidadeEspecial();
        naruto.mostrarRankNinja();
        naruto.tacarKunai();

        System.out.println(" ");
        System.out.println("Um atributo Final");
        System.out.println(naruto.poder);
    }
}
