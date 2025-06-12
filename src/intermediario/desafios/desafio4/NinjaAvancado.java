package intermediario.desafios.desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("==== Ficha Ninja Avançado ====");
        System.out.println("|Nome: " + this.nome);
        System.out.println("|Idade: " + this.idade);
        System.out.println("|Habilidade: " + this.habilidade);
        System.out.println("|Especialidade: " + this.especialidade);
        System.out.println("====     Fim da Ficha     ====");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Ninja Avançado: " + this.nome + " Executa:\n" + habilidade);
    }
}
