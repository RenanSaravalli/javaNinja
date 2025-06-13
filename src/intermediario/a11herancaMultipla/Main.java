package intermediario.a11herancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia Da Folha";
        sasuke.sharinganAtivado();

        System.out.println(" ");

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.idade = 30;
        kakashi.aldeia = "Aldeia da folha";
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hogakeAtivo();

        System.out.println(" ");

        Uzumaki naruto = new Uzumaki(Biju.KURAMA);

        System.out.println("Biju: " + naruto.getBiju());
    }
}
