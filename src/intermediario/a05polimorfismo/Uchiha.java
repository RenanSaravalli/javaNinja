package intermediario.a05polimorfismo;

public class Uchiha extends Ninja{

    // Isso é o polimorfismo Sobrescrevendo o métod da classe que é extendida
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " esse é meu ataque Uchiha, um ataque de fogo");

    }
}
