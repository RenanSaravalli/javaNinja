package intermediario.abstractXsInterfaces;

public class TesteIntAbst {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", 18, "Aldeia da Folha");
        // Métod normal da classe abstrata
        naruto.chutar();
        // Métod abstrato da classe abstrata
        naruto.jutsuCabuloso();

        Uchiha sasuke = new Uchiha("Sasuke", 18, "Aldeia da Folha");
        // Métod abstrato da interface
        sasuke.socar();
        // Métod abstrato da interface
        sasuke.jutsuMuitoFoda();

        // Atributo já definido na interface:
        System.out.println(sasuke.ehNinja);
    }
}
