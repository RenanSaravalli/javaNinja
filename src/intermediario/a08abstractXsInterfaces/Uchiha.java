package intermediario.a08abstractXsInterfaces;

public class Uchiha implements NinjaInterf{
    String nome;
    int idade;
    String aldeia;

    // Todos métodos trazidos da interface
    // e sobrescrevendo os métodos
    @Override
    public void socar() {
        System.out.println("Ninja " + nome + " Socando");
    }

    @Override
    public void jutsuMuitoFoda() {
        System.out.println("Ninja " + nome + " soltando amaterasu");
    }

    public Uchiha(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
