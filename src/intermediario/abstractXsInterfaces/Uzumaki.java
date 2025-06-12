package intermediario.abstractXsInterfaces;

public class Uzumaki extends Ninja{

    // Métod abstrado trazido da classe abstrata
    // O sobrescrevendo o métodos
    @Override
    public void jutsuCabuloso() {
        System.out.println("Ninja: " + nome + " Shuriken Rasengan");
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

}
