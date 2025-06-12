package iniciante.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /* Ternarios
        *  -> Maneiras de reduzir o código / Funcionando de forma semelhante ao if else
        *  -> variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
