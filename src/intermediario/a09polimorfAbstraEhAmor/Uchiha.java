package intermediario.a09polimorfAbstraEhAmor;

public class Uchiha extends Ninja {
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " Zoio vermeio segura meu mangekio");
    }
}
