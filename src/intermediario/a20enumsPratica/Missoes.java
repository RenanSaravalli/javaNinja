package intermediario.a20enumsPratica;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    // Métod para mostrar mais informações
    public void exebirDetalhes() {
        System.out.println("Missão: " + nome + " Rank: " + rank + " Descrição: " + rank.getDescricao() + "\nDificuldade: " + rank.getDificuldade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
