package intermediario.desafios.desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico () {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("==== Ficha Ninja Básico ====");
        System.out.println("|Nome: " + this.nome);
        System.out.println("|Idade: " + this.idade);
        System.out.println("|Habilidade: " + this.habilidade);
        System.out.println("====     Fim da Ficha     ====");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ninja básico: " + this.nome + " Executa:\n" + habilidade);
    }
}
