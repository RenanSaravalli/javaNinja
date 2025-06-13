package intermediario.a15refDeMemoriaXsValorMemoria;

public abstract class Ninja implements EstrategiaDeBatalha {

    // TODO incluir novos 2 atributos: numeroDeMissoesConciluidas, rank
    // TODO Rank: Gennin, chunnin, jounin, hokage

    String aldeia;
    String nome;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    public Ninja() {
    }

    // Métod existente: Primeiro métod
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    // TODO sobrecarga do construtor chamando os novos atributs
    // Sobrecarga de métodos não precisamos redeclarar o construtor so os novos atributos.

    public Ninja(String aldeia, String nome, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia); // Referenciando os atributos do construtor acima
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void mostrarRankNinja() {
        System.out.println("Meu nome é: " + nome + " Sou nível: " + this.rank);
    }

    public abstract void habilidadeEspecial();

    // Sobrescrevendo o métod da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " essa é a minha ESTRATEGIA de batalha!! ");
    }

    // Sobrecarga de métod - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " essa é a minha INTELIGENCIA de batalha!! ");
    }
    // Interligencia de combate. Sobrecarga de métod utilizando o parâmetro do métod
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " eu sou da aldeia: " + aldeia + " e tenho: " + idade + " anos";
    }
}
