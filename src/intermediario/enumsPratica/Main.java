package intermediario.enumsPratica;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);

        missao1.exebirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exebirDetalhes();

        
    }
}
