package iniciante.Condicoes;

public class IfAndElse {
    public static void main(String[] args) {
        /* Objetivo da aula:
        * -> Passar o nível do ninja de acordo com o número de missões
        * -> If e ELse -> condições
        * else-if
        *   */

        // Ninja naruto
        String nome = "Naruto";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String ranking;

        // se (condicao) {faça isso}
        if (numeroDeMissoes >= 10 && idade >= 15) {
            ranking = "Chunnin";
            System.out.println(nome + " esta pronto para passa de nivel!");
        }
        else if (numeroDeMissoes >= 20 && idade >= 20) {
            System.out.println(nome + " esta pronto para passa de nivel!");
            ranking = "Jounin";
        }
        else {
            ranking = "Gennim";
        }
        System.out.println("agora o " + nome + " é de nivel " + ranking);

    }
}
