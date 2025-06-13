package intermediario.a11herancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, HogakeInterface{
    public void boasVindas() {
        System.out.println("Meu nome é: " + nome + " Eu sou um hatake");
    }

    // implementando o métod da interface
    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é: " + nome + " ativou o sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Meu nome é: " + nome + " Eu sou um ninja de elite da anbu");
    }

    @Override
    public void hogakeAtivo() {
        System.out.println("Meu nome é: " + nome + " Eu sou um Hokage");
    }
}
