package intermediario.overloadMetods;

public class Uzumaki extends Ninja {
    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(aldeia, nome, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " sou um Uzumaki. Ataque de vento\nJá completei " + this.numeroDeMissoesConcluidas + " Missões");
    }

}
