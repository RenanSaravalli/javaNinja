package intermediario.polimorfAbstraEhAmor;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto", 17, "Aldeia Da Folha");
        naruto.socoMuitoForte();
        naruto.habilidadeEspecial();
        naruto.estrategiaDoNinjaParaBatalha();

        System.out.println(" ");

        Uchiha sasuke = new Uchiha("Sasuke", 17, "Aldeia Da Folha");
        sasuke.socoMuitoForte();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDoNinjaParaBatalha();
    }
}
