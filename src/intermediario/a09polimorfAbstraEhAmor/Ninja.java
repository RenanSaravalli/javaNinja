package intermediario.a09polimorfAbstraEhAmor;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    // Métod normal geral que todos os ninjas vão ter
    public void socoMuitoForte(){
        System.out.println("Ninja: " + nome + " Socando");
    }

    // Métod abstrato que obrigatoriamente a classe filha tem que implementar
    public abstract void habilidadeEspecial();

    // Sobrescrevendo o métod da interface
    @Override
    public void estrategiaDoNinjaParaBatalha() {
        System.out.println("Meu nome é: " + nome + " Essa é a estratégia de batalha do ninja");
    }
}
