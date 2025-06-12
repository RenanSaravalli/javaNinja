package intermediario.enumsPratica;

public enum RankDeMissoes {
    /* Vamos usar a classe enum toda vez que quisermos padronizar nosso código
    * Um enum só pode ser utilizado quando temos CERTEZA que o que vamos colocar em um ENUM não vai mudar*/
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Dificil", 5),
    S("Altissimo", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
