package intermediario.polimorfAbstraEhAmor;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " Chackara pra carai toma meu rasengan");
    }
}
