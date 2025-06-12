package intermediario.desafios.desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void criarUchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Sou um uchiha e tenho uma habilidade especial:\n" + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("===== Ficha Ninja =====");
        System.out.println("| Nome: " + nome);
        System.out.println("| Idade: " + idade);
        System.out.println("| Missão: " + missao);
        System.out.println("| Nível Missão: " + nivelDificuldade);
        System.out.println("| Status Missão: " + statusMissao);
        System.out.println("| Habilidade especial: " + habilidadeEspecial);
        System.out.println("===== Fim da Ficha =====");
    }

    public void atualizarHabilidadeEspecial(String novaHabilidadeEspecial) {
        this.habilidadeEspecial = novaHabilidadeEspecial;
    }


}
