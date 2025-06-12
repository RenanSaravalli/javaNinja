package intermediario.desafios.desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void criarNinja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("===== Ficha Ninja =====");
        System.out.println("| Nome: " + nome);
        System.out.println("| Idade: " + idade);
        System.out.println("| Missão: " + missao);
        System.out.println("| Nível Missão: " + nivelDificuldade);
        System.out.println("| Status Missão: " + statusMissao);
        System.out.println("===== Fim da Ficha =====");
    }
}
